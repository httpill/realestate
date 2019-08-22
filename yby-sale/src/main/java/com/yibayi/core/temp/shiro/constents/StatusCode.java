package com.yibayi.core.temp.shiro.constents;

/**
 * 状态码
 * 
 * @author lwx
 */
public interface StatusCode {

	String PC = "pc";

	String APP = "app";

	String H5 = "h5";

	/**
	 * 已登录
	 */
	String ALREADY_LOGIN = "10000";

	/**
	 * 未登录
	 */
	String NOT_LOGIN = "10001";

	/**
	 * 成功
	 */
	String SUCCESS = "10200";

	/**
	 * 失败
	 */
	String ERROR = "10400";

	/**
	 * 非法请求
	 */
	String UNLAWFUL = "10401";

	/**
	 * 已存在
	 */
	String ALREADY_EXIST = "10403";

	/**
	 * 找不到
	 */
	String NOT_FOUND = "10404";

	/**
	 * 审核中
	 */
	String INREVIEW = "10407";

	/**
	 * 超时
	 */
	String TIME_OUT = "10408";

	/**
	 * 失效
	 */
	String DISABLED = "10409";

	/**
	 * 参数错误
	 */
	String PARAM_ERROR = "10500";

	/**
	 * 密码错误
	 */
	String PASSWORD_ERROR = "10501";

	/**
	 * 次数限制
	 */
	String TRIES_LIMIT = "10505";

	/**
	 * 验证码错误
	 */
	String CAPTCHA_ERROR = "10506";
	
	/**
	 * 用户不是商家
	 */
	String NOT_MERCHANT = "10507";
	
	/**
	 * 商家已被冻结
	 */
	String MERCHANT_FREEZE = "10508";

	/**
	 * 用户已是客服
	 */
	String IS_SERVICE = "10509";

	/**
	 * 用户没有权限
	 */
	String NOT_PERMSSION = "10510";

	/**
	 * 登录/注册相关状态码 - 10xxx
	 */
	public static class LOGIN {

		/**
		 * 图片验证码验证成功
		 */
		public static final String IMAGE_CAPTCHA_SUCCESS = "10201";

		/**
		 * 短信验证码验证成功
		 */
		public static final String SMS_CAPTCHA_SUCCESS = "10202";

		/**
		 * 图片验证码验证失败
		 */
		public static final String IMAGE_CAPTCHA_ERROR = "10401";

		/**
		 * 短信验证码验证失败
		 */
		public static final String SMS_CAPTCHA_ERROR = "10402";

		/**
		 * 密码错误
		 */
		public static final String PASSWORD_ERROR = "10405";

		/**
		 * 短信验证码触发流控
		 */
		public static final String SMS_CAPTCHA_LIMIT = "10409";

		/**
		 * 短信验证码触发分钟级流控
		 */
		public static final String SMS_CAPTCHA_LIMIT_MINUTE = "10419";

		/**
		 * 短信验证码触发小时级流控
		 */
		public static final String SMS_CAPTCHA_LIMIT_HOUR = "10429";

		/**
		 * 短信验证码触发天级流控
		 */
		public static final String SMS_CAPTCHA_LIMIT_DAY = "10439";
	}

	/**
	 * 用户相关状态码 - 90xxx
	 */
	public static class USER {

		/**
		 * 冻结
		 */
		public static final String FREEZE = "90401";

		/**
		 * 解冻
		 */
		public static final String unfreeze = "90403";

		/**
		 * 失效/未启用
		 */
		public static final String DISABLE = "90402";
	}

	/**
	 * 身份证认证接口相关状态码
	 */
	public static class CERTIFICATION {

		/**
		 * 认证通过
		 */
		public static final String SUCCESS = "0";

		/**
		 * 参数不完整
		 */
		public static final String INCOMPLETE_PARAMETER = "80001";

		/**
		 * 姓名格式不正确
		 */
		public static final String INCORRECT_NAME_FORMAT = "80003";

		/**
		 * 身份证号码格式不正确
		 */
		public static final String INCORRECT_ID_CARD_FORMAT = "80004";

		/**
		 * 身份证中心维护，请稍后重试
		 */
		public static final String MAINTAINED = "80008";

		/**
		 * 无此身份证号码
		 */
		public static final String NO_ID_NUMBER = "90033";

		/**
		 * 认证不通过，信息不一致
		 */
		public static final String ERROR = "90099";
	}
}
