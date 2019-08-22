package com.yibayi.core.temp.shiro;

import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;

public class CustomWebSessionManager extends DefaultWebSessionManager {

	// 使用Servlet Session
	@Override
	public boolean isServletContainerSessions() {
		return true;
	}
}
