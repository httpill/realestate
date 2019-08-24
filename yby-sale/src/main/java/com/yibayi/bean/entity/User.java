package com.yibayi.bean.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1361985231628722109L;

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 默认昵称
     */
    private String defaultNickName;

    /**
     * 微信昵称
     */
    private String wxNickName;

    /**
     * 微信用户唯一标识<请注意，在未关注公众号时，用户访问公众号的网页，也会产生一个用户和公众号唯一的OpenID>
     */
    private String wxOpenId;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 所属角色ID
     */
    private Long roleId;

    /**
     * 类型
     */
    private String type;

    /**
     * 性别(1：男，0：女)
     */
    private String sex;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 所属国家
     */
    private String country;

    /**
     * 所属国家编码
     */
    private String countryCode;

    /**
     * 地区编码
     */
    private String areaCode;

    /**
     * 城市编码
     */
    private String cityCode;

    /**
     * 省份编号
     */
    private String provinceCode;

    /**
     * 地区名称
     */
    private String areaName;

    /**
     * 地址
     */
    private String address;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 手机归属地(国际区号)
     */
    private String mobileHome;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * qq号
     */
    private String qq;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 微信二维码
     */
    private String wechatQr;

    /**
     * 身份证号码
     */
    private String idcard;

    /**
     * 身份证正面照
     */
    private String idcardFrontPic;

    /**
     * 身份证背面照
     */
    private String idcardBackPic;

    /**
     * 头像
     */
    private String photo;

    /**
     * 默认头像
     */
    private String defaultPhoto;

    /**
     * 微信头像
     */
    private String wxPhoto;

    /**
     * 电话2
     */
    private String phone2;

    /**
     * 护照
     */
    private String passport;

    /**
     * 紧急联系人
     */
    private String contact;

    /**
     * 紧急联系人联系方式
     */
    private String contactWay;

    /**
     * 紧急联系人关系
     */
    private String contactRelation;

    /**
     * 注册ip
     */
    private String registerIp;

    /**
     * 最后登陆IP
     */
    private String loginIp;

    /**
     * 最后登录时间
     */
    private Date loginTime;

    /**
     * 连续登录失败次数
     */
    private Integer loseCount;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 是否启用（0：否，1：是）
     */
    private Byte isEnabled;

    /**
     * 是否已实名认证（0：否，1：是）
     */
    private Byte isCheck;

    /**
     * 后台备注（仅后台可见）
     */
    private String remark;

    /**
     * 注册来源
     */
    private String registerOrigin;

    /**
     * 注册来源备注
     */
    private String originRemark;

    /**
     * 个人推荐码
     */
    private String recommendCode;

    /**
     * 推荐码ACSII值
     */
    private Long recommendAscii;

    /**
     * 推荐人ID
     */
    private Long referrerId;

    /**
     * 描述
     */
    private String description;
    /**
     * 状态   (启用 - normal，停用 - stop)
     */
    private String status;
    /**
     * 排序
     */
    private Float sort;

    /**
     * 是否删除
     */
    private Byte isDelete;

    /**
     * 创建人
     */
    private Long creator;

    /**
     * 修改人
     */
    private Long modifier;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;
}
