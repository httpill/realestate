package com.yibayi.core.temp.shiro.realm;

import com.yibayi.core.temp.shiro.constents.DictionaryCode;
import com.yibayi.core.temp.shiro.po.AdminCustom;
import com.yibayi.core.temp.shiro.service.AdminService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

/**
 * <p>
 * Realm：域，Shiro从从Realm获取安全数据（如用户、角色、权限），
 * <p>
 * 就是说SecurityManager要验证用户身份，那么它需要从Realm获取相应的用户进行比较以确定用户身份是否合法；
 * <p>
 * 也需要从Realm得到用户相应的角色/权限进行验证用户是否能进行操作；
 * <p>
 * 可以把Realm看成DataSource，即安全数据源
 * 
 * @author lwx
 */
public class CustomRealm extends AuthorizingRealm {

	@Resource
	private AdminService adminService;

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	// 设置realm的名称
	@Override
	public void setName(String name) {
		super.setName(name);
	}

	// TODO 暂无角色、权限体系
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// String userName = (String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

		/*
		 * // 根据用户名查询当前用户拥有的角色 Set<Role> roles = adminService.findRoles(username);
		 * Set<String> roleNames = new HashSet<String>(); for (Role role : roles) {
		 * roleNames.add(role.getRole()); } // 根据用户名查询当前用户拥有的角色
		 * authorizationInfo.setRoles(adminService.findRoles(userName)); //
		 * 根据用户名查询当前用户权限
		 * authorizationInfo.setStringPermissions(adminService.findPermissions(userName)
		 * );
		 */

		return authorizationInfo;
	}

	// TODO 账号查找
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		String account = (String) token.getPrincipal();

		AdminCustom admin = adminService.getByAccount(account);
		// 没找到帐号
		if (admin == null) {
			throw new UnknownAccountException();
		}
		// 帐号冻结/锁定
		if (DictionaryCode.ACCOUNT_STATUS.FREEZE.equals(admin.getStatus())) {
			throw new LockedAccountException();
		}

		// 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				// 用户名
				//admin.getUserName(),
				admin.getMobile(),
				// 密码
				admin.getPassword(),
				// 盐值
				ByteSource.Util.bytes(admin.getSalt()),
				// realm name
				this.getName());
		return authenticationInfo;
	}

	@Override
	public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
		super.clearCachedAuthorizationInfo(principals);
	}

	@Override
	public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
		super.clearCachedAuthenticationInfo(principals);
	}

	@Override
	public void clearCache(PrincipalCollection principals) {
		super.clearCache(principals);
	}

	public void clearAllCachedAuthorizationInfo() {
		getAuthorizationCache().clear();
	}

	public void clearAllCachedAuthenticationInfo() {
		getAuthenticationCache().clear();
	}

	public void clearAllCache() {
		clearAllCachedAuthenticationInfo();
		clearAllCachedAuthorizationInfo();
	}

}