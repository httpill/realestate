package com.yibayi.core.temp.shiro.po;

public class AdminCustom extends Admin {

	private static final long serialVersionUID = 4044546759624587511L;

	private String roleName;

	public AdminCustom() {
		super();
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
