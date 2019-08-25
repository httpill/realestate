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
 * 二手房
 * </p>
 *
 * @author mamba
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ResoldApartment对象", description="二手房")
public class ResoldApartment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户id---业主id")
    private Long userId;

    @ApiModelProperty(value = "业主名称")
    private String ownerName;

    @ApiModelProperty(value = "业主联系方式")
    private String ownerContact;

    @ApiModelProperty(value = "房源名称")
    private String apartmentName;

    @ApiModelProperty(value = "审核状态(待审核-pending,审核通过-pass,审核不通过-failure)")
    private String auditStatus;

    @ApiModelProperty(value = "审核人")
    private Long auditOperator;

    @ApiModelProperty(value = "审核时间")
    private Date auditTime;

    @ApiModelProperty(value = "审核说明")
    private String auditExplain;

    @ApiModelProperty(value = "销售状态(在售-onsale,已售-sold)")
    private String sellStatus;

    @ApiModelProperty(value = "发布状态(上架-normal,下架-stop)")
    private String releaseStatus;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区")
    private String district;

    @ApiModelProperty(value = "经度")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    private String latitude;

    @ApiModelProperty(value = "售价")
    private BigDecimal price;

    @ApiModelProperty(value = "单价")
    private BigDecimal unitPrice;

    @ApiModelProperty(value = "面积")
    private BigDecimal area;

    @ApiModelProperty(value = "交楼时间")
    private Date deliveryTime;

    @ApiModelProperty(value = "seo标题")
    private String seoTitle;

    @ApiModelProperty(value = "seo描述")
    private String seoDescription;

    @ApiModelProperty(value = "seo关键字")
    private String seoKeyword;

    @ApiModelProperty(value = "用户创建时间")
    private Date userCreateTime;

    @ApiModelProperty(value = "用户创建人")
    private Long userCreator;

    @ApiModelProperty(value = "用户更新时间")
    private Date userUpdateTime;

    @ApiModelProperty(value = "用户更新人")
    private Long userModifier;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private Long creator;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "更新人")
    private Long modifier;

    @ApiModelProperty(value = "删除标识(0-未删除，1-删除)")
    @TableLogic
    private Integer delFlag;


}
