package com.yibayi.service.resold.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.yibayi.bean.entity.data.DataAnalysis;
import com.yibayi.bean.entity.data.constant.DataTypeConstant;
import com.yibayi.bean.entity.resold.RaAttribute;
import com.yibayi.bean.entity.resold.RaBuildRelevance;
import com.yibayi.bean.entity.resold.RaLabelRelevance;
import com.yibayi.bean.entity.resold.ResoldApartment;
import com.yibayi.bean.entity.resold.constant.RAConstant;
import com.yibayi.bean.entity.resold.dto.ReleaseRADto;
import com.yibayi.dao.resold.ResoldApartmentMapper;
import com.yibayi.service.data.DataAnalysisService;
import com.yibayi.service.resold.RaAttributeService;
import com.yibayi.service.resold.RaBuildRelevanceService;
import com.yibayi.service.resold.RaLabelRelevanceService;
import com.yibayi.service.resold.ResoldApartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.BeanUtil;

import javax.xml.datatype.DatatypeConstants;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 二手房 服务实现类
 * </p>
 *
 * @author mamba
 * @since 2019-08-25
 */
@Service
public class ResoldApartmentServiceImpl extends ServiceImpl<ResoldApartmentMapper, ResoldApartment> implements ResoldApartmentService {
    @Autowired
    private RaAttributeService raAttributeService;
    @Autowired
    private RaLabelRelevanceService raLabelRelevanceService;
    @Autowired
    private RaBuildRelevanceService raBuildRelevanceService;
    @Autowired
    private DataAnalysisService dataAnalysisService;

    public void releaseRA(ReleaseRADto releaseRADto){
        //赋值给二手房实体
        ResoldApartment resoldApartment = new ResoldApartment();
        BeanUtil.copy(releaseRADto,resoldApartment);
        //判断ID是否存在
        if(releaseRADto.getRaId() != null && releaseRADto.getRaId() != 0){
            resoldApartment.setId(releaseRADto.getRaId());
        }
        /*数据处理*/
        //计算单价
        resoldApartment.setUnitPrice(resoldApartment.getPrice().divide(resoldApartment.getArea()).setScale(2));
        //默认状态  待审核，在售，上架
        resoldApartment.setAuditStatus(RAConstant.AUDIT_STATUS_PENDING);
        resoldApartment.setReleaseStatus(RAConstant.RELEASE_STATUS_NORMAL);
        resoldApartment.setSellStatus(RAConstant.SELL_STATUS_ON_SALE);
        //插入或更新二手房
        saveOrUpdate(resoldApartment);
        //查询二手房属性表
        RaAttribute raAttribute = raAttributeService.getOne(new QueryWrapper<RaAttribute>().lambda().eq(RaAttribute::getRaId,resoldApartment.getId()).eq(RaAttribute::getDelFlag,0));
        BeanUtil.copy(releaseRADto,raAttribute);
        raAttribute.setRaId(resoldApartment.getId());
        //插入或更新二手房
        raAttributeService.saveOrUpdate(raAttribute);
        //插入关联标签中间表,删除----插入
        raLabelRelevanceService.phyDel(resoldApartment.getId());
        List<RaLabelRelevance> labelRelevanceList = new ArrayList<>();
        for (Long aLong : releaseRADto.getLabelIdList()) {
            RaLabelRelevance raLabelRelevance = new RaLabelRelevance();
            raLabelRelevance.setDictId(aLong);
            raLabelRelevance.setRaId(resoldApartment.getId());
            labelRelevanceList.add(raLabelRelevance);
        }
        raLabelRelevanceService.saveBatch(labelRelevanceList);
        //插入关联新盘中间表，删除----插入
        raBuildRelevanceService.phyDel(resoldApartment.getId());
        RaBuildRelevance raBuildRelevance = new RaBuildRelevance();
        raBuildRelevance.setBuildId(releaseRADto.getBuildId());
        raBuildRelevance.setRaId(resoldApartment.getId());
        raBuildRelevanceService.save(raBuildRelevance);
        //插入数据分析
        DataAnalysis dataAnalysis = dataAnalysisService.getOne(new QueryWrapper<DataAnalysis>().lambda().eq(DataAnalysis::getDataId,resoldApartment.getId()).eq(DataAnalysis::getDataType,DataTypeConstant.SECOND_HOUSE));
        if(dataAnalysis == null){
            dataAnalysis = new DataAnalysis();
            dataAnalysis.setDataType(DataTypeConstant.SECOND_HOUSE);
            dataAnalysis.setDataId(resoldApartment.getId());
            dataAnalysis.setView(0);
            dataAnalysis.setViewManual(0);
            dataAnalysis.setWeighted(0F);
            dataAnalysis.setCollect(0);
            dataAnalysis.setCollectManual(0);
            dataAnalysis.setSubscription(0);
            dataAnalysis.setSubscriptionManual(0);
            dataAnalysis.setShare(0);
            dataAnalysis.setShareManual(0);
            dataAnalysisService.save(dataAnalysis);
        }
    }

}
