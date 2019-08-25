package com.yibayi.service.resold;

import com.yibayi.bean.entity.resold.RaLabelRelevance;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 二手房与标签关联表 服务类
 * </p>
 *
 * @author mamba
 * @since 2019-08-25
 */
public interface RaLabelRelevanceService extends IService<RaLabelRelevance> {
    void phyDel(long raId);
}
