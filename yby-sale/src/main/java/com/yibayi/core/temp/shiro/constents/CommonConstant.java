package com.yibayi.core.temp.shiro.constents;

public interface CommonConstant {
	
	/**
	 * 后台界面每页条数
	 */
	int MANAGEMENT_PAGE_SIZE=10;
	
	/**
	 * 前台界面每页条数
	 */
	int FRONT_PAGE_SIZE=10;

	/**
	 * 用户
	 */
	public String USER = "user";

	/**
	 * 密码
	 */
	public String PASSWORD = "password";

	/**
	 * 请求状态
	 */
	public String STATUS = "status";

	/**
	 * 请求成功状态码
	 */
	public String SUCCESS = "success";

	/**
	 * 请求失败状态码
	 */
	public String ERROR = "error";

	/**
	 * 请求回调
	 */
	public String CALL_BACK = "callback";

	/**
	 * TOKEN Key连接符
	 */
	public String TOKEN_MARK = "-";

	/**
	 * token盐值
	 */
	public String TOKEN_SALT = "01426c5b-dee9-4573-8af7-6663f1b052c4";
}
