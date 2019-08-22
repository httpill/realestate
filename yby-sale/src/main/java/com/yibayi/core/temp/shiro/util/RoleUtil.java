package com.yibayi.core.temp.shiro.util;


import com.yibayi.core.temp.shiro.constents.DictionaryCode;

/**
 * <pre>
 * 角色工具类
 * 注：因系统暂未设计开发角色体系，故暂使用此种方式做临时处理
 * </pre>
 * 
 * @author lwx
 */
public class RoleUtil {

	/**
	 * 获取角色名称
	 * 
	 * @param roleId
	 *            角色ID
	 * @return 角色名称
	 */
	public static String getRoleName(Long roleId) {
		if(roleId == null) {
			return null;
		}
		String roleName = "";
		if (DictionaryCode.RoleLongType.ADMIN == roleId) {
			roleName = "超级管理员";
		} else if (DictionaryCode.RoleLongType.ANCHOR == roleId) {
			roleName = "特邀主播";
		} else if (DictionaryCode.RoleLongType.COUNSELOR == roleId) {
			roleName = "置业顾问";
		} else if (DictionaryCode.RoleLongType.USER == roleId) {
			roleName = "普通用户";
		} else if (DictionaryCode.RoleLongType.OPERATION == roleId) {
			roleName = "运营";
		} else if (DictionaryCode.RoleLongType.SERVICE == roleId) {
			roleName = "客服";
		} else if (DictionaryCode.RoleLongType.MERCHANT == roleId) {
			roleName = "商家";
		}
		return roleName;
	}
}
