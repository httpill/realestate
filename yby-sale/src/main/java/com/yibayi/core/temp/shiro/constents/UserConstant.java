package com.yibayi.core.temp.shiro.constents;

public interface UserConstant {

	/**
	 * 用户默认头像
	 */
	String DEFAULT_PHOTO_PATH = "realestate/default/user/header.png";
	
	/**
	 * 推荐社区用户默认头像
	 */
	String COMMUNITY_USER_PHOTO_PATH = "realestate/user/images/2018/09/19/5c805aec16ef4533a39ac90ecf09e1d7.png";

	/**
	 * 商户默认广告图
	 */
	String DEFAULT_PHOTO_MERCHANT_ADVERTISEMENT = "realestate/default/merchant/advertisement.png";

	/**
	 * 商户默认封面图
	 */
	String DEFAULT_PHOTO_MERCHANT_COVER = "realestate/default/merchant/cover.png";

	/**
	 * 商户默认logo
	 */
	String DEFAULT_PHOTO_MERCHANT_LOGO = "realestate/default/merchant/logo.png";

	/**
	 * 门户密码加密次数
	 */
	int ENCODE_DEGREE = 2;

	/**
	 * 后台密码加密次数
	 */
	int MANAGE_ENCODE_DEGREE = 3;

	/**
	 * 密码加密规则
	 */
	String ENCODE_RULE = "MD5";
}
