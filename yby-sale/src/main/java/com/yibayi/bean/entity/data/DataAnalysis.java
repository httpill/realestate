package com.yibayi.bean.entity.data;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 数据分析
 * </p>
 *
 * @author mamba
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="DataAnalysis对象", description="数据分析")
public class DataAnalysis implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "数据类型(sencondhouse-二手房)")
    private String dataType;

    @ApiModelProperty(value = "数据id")
    private Long dataId;

    @ApiModelProperty(value = "浏览量-自然增长率")
    private Integer view;

    @ApiModelProperty(value = "浏览量-手动干预")
    private Integer viewManual;

    @ApiModelProperty(value = "权重值")
    private Float weighted;

    @ApiModelProperty(value = "收藏量-自然增长率")
    private Integer collect;

    @ApiModelProperty(value = "收藏量-手动干预")
    private Integer collectManual;

    @ApiModelProperty(value = "房价订阅量-自然增长率")
    private Integer subscription;

    @ApiModelProperty(value = "房价订阅量-手动干预")
    private Integer subscriptionManual;

    @ApiModelProperty(value = "分享量-自然增长率")
    private Integer share;

    @ApiModelProperty(value = "分享量-手动干预")
    private Integer shareManual;


}
