package com.yibayi.service.resold.impl;

import com.yibayi.bean.entity.resold.RaLabelRelevance;
import com.yibayi.dao.resold.RaLabelRelevanceMapper;
import com.yibayi.service.resold.RaLabelRelevanceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 二手房与标签关联表 服务实现类
 * </p>
 *
 * @author mamba
 * @since 2019-08-25
 */
@Service
public class RaLabelRelevanceServiceImpl extends ServiceImpl<RaLabelRelevanceMapper, RaLabelRelevance> implements RaLabelRelevanceService {
    @Autowired
    private RaLabelRelevanceMapper raLabelRelevanceMapper;

    /**
     * 物理删除二手房关联标签
     * @param raId
     */
    public void phyDel(long raId){
        raLabelRelevanceMapper.phyDel(raId);
    }
}
