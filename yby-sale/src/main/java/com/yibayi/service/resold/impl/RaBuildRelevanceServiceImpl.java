package com.yibayi.service.resold.impl;

import com.yibayi.bean.entity.resold.RaBuildRelevance;
import com.yibayi.dao.resold.RaBuildRelevanceMapper;
import com.yibayi.service.resold.RaBuildRelevanceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 二手房与新盘关联表 服务实现类
 * </p>
 *
 * @author mamba
 * @since 2019-08-25
 */
@Service
public class RaBuildRelevanceServiceImpl extends ServiceImpl<RaBuildRelevanceMapper, RaBuildRelevance> implements RaBuildRelevanceService {
    @Autowired
    private RaBuildRelevanceMapper raBuildRelevanceMapper;

    /**
     * 物理删除二手房关联新盘
     * @param raId
     */
    public void phyDel(long raId){
        raBuildRelevanceMapper.phyDel(raId);
    }

}
