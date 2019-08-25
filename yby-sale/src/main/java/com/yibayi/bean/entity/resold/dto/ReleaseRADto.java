package com.yibayi.bean.entity.resold.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Classname ReleaseRADto
 * @Description 房源录入
 * @Date 2019/8/25 15:32
 * @Created by SSL
 */
@Data
public class ReleaseRADto {

    @ApiModelProperty(value = "新盘ID")
    private Long buildId;

    @ApiModelProperty(value = "房源名称")
    private String apartmentName;

    @ApiModelProperty(value = "楼层")
    private int floor;

    @ApiModelProperty(value = "总楼层")
    private int floorTotal;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区")
    private String district;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "经度")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    private String latitude;

    @ApiModelProperty(value = "面积")
    private BigDecimal area;

    @ApiModelProperty(value = "交楼时间")
    private Date deliveryTime;

    @ApiModelProperty(value = "物业类型")
    private String tenement;

    @ApiModelProperty(value = "物业费")
    private BigDecimal tenementPrice;

    @ApiModelProperty(value = "户型-室")
    private Integer room;

    @ApiModelProperty(value = "户型-厅")
    private Integer livingRoom;

    @ApiModelProperty(value = "户型-卫")
    private Integer toilet;

    @ApiModelProperty(value = "户型-阳台")
    private Integer veranda;

    @ApiModelProperty(value = "售价")
    private BigDecimal price;

    @ApiModelProperty(value = "标签List")
    private List<Long> labelIdList;

    @ApiModelProperty(value = "产权 (-1-永久)")
    private Integer property;

    @ApiModelProperty(value = "核心卖点")
    private String info;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "业主名称")
    private String ownerName;

    @ApiModelProperty(value = "业主联系方式")
    private String ownerContact;

}
