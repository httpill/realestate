package com.yibayi.dao.resold;

import com.yibayi.bean.entity.resold.RaLabelRelevance;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 二手房与标签关联表 Mapper 接口
 * </p>
 *
 * @author mamba
 * @since 2019-08-25
 */
public interface RaLabelRelevanceMapper extends BaseMapper<RaLabelRelevance> {

    int phyDel(long raId);
}
