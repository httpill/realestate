package com.yibayi.bean.entity.resold;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 二手房属性
 * </p>
 *
 * @author mamba
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="RaAttribute对象", description="二手房属性")
public class RaAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "二手房ID")
    private Long raId;

    @ApiModelProperty(value = "核心卖点")
    private String info;

    @ApiModelProperty(value = "户型-室")
    private Integer room;

    @ApiModelProperty(value = "户型-厅")
    private Integer livingRoom;

    @ApiModelProperty(value = "户型-卫")
    private Integer toilet;

    @ApiModelProperty(value = "户型-阳台")
    private Integer veranda;

    @ApiModelProperty(value = "楼层")
    private Integer floor;

    @ApiModelProperty(value = "总楼层")
    private Integer floorTotal;

    @ApiModelProperty(value = "装修类型")
    private String fitmentType;

    @ApiModelProperty(value = "产权 (-1-永久)")
    private Integer property;

    @ApiModelProperty(value = "物业类型")
    private String tenement;

    @ApiModelProperty(value = "物业费")
    private BigDecimal tenementPrice;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private Long creator;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "修改人")
    private Long modifier;

    @ApiModelProperty(value = "删除标识 (0-未删除,1-删除)")
    @TableLogic
    private Integer delFlag;


}
