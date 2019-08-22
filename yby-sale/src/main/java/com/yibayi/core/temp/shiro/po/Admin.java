package com.yibayi.core.temp.shiro.po;

import java.io.Serializable;
import java.util.Date;

public class Admin extends BaseEntity implements Serializable {
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
     * 地区编码
     */
    private String areaCode;

    /**
     * 城市编码
     */
    private String cityCode;

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

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getWechatQr() {
        return wechatQr;
    }

    public void setWechatQr(String wechatQr) {
        this.wechatQr = wechatQr;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getIdcardFrontPic() {
        return idcardFrontPic;
    }

    public void setIdcardFrontPic(String idcardFrontPic) {
        this.idcardFrontPic = idcardFrontPic;
    }

    public String getIdcardBackPic() {
        return idcardBackPic;
    }

    public void setIdcardBackPic(String idcardBackPic) {
        this.idcardBackPic = idcardBackPic;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getContactRelation() {
        return contactRelation;
    }

    public void setContactRelation(String contactRelation) {
        this.contactRelation = contactRelation;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getLoseCount() {
        return loseCount;
    }

    public void setLoseCount(Integer loseCount) {
        this.loseCount = loseCount;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Byte getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Byte getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Byte isCheck) {
        this.isCheck = isCheck;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", nickName=").append(nickName);
        sb.append(", password=").append(password);
        sb.append(", age=").append(age);
        sb.append(", signature=").append(signature);
        sb.append(", roleId=").append(roleId);
        sb.append(", type=").append(type);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", areaName=").append(areaName);
        sb.append(", address=").append(address);
        sb.append(", mobile=").append(mobile);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", qq=").append(qq);
        sb.append(", wechat=").append(wechat);
        sb.append(", wechatQr=").append(wechatQr);
        sb.append(", idcard=").append(idcard);
        sb.append(", idcardFrontPic=").append(idcardFrontPic);
        sb.append(", idcardBackPic=").append(idcardBackPic);
        sb.append(", photo=").append(photo);
        sb.append(", passport=").append(passport);
        sb.append(", contact=").append(contact);
        sb.append(", contactWay=").append(contactWay);
        sb.append(", contactRelation=").append(contactRelation);
        sb.append(", registerIp=").append(registerIp);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", loseCount=").append(loseCount);
        sb.append(", salt=").append(salt);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", isCheck=").append(isCheck);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}