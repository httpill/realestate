package com.yibayi.bean.entity.resold;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 二手房与新盘关联表
 * </p>
 *
 * @author mamba
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="RaBuildRelevance对象", description="二手房与新盘关联表")
public class RaBuildRelevance implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "二手房ID")
    private Long raId;

    @ApiModelProperty(value = "新盘ID")
    private Long buildId;


}
