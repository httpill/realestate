package com.yibayi.core.temp.shiro.filter;

import bean.common.response.ResponseBean;
import bean.common.response.ResponseStatusEnum;
import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 拦截登录超时或无权限用户
 * 
 * @author lwx
 */
public class AuthorizeFilter extends AuthorizationFilter {

	@Override
	protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse)
			throws IOException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		Subject subject = getSubject(request, response);
		if (!subject.isAuthenticated()) {
			printMsg(request, response);
			// response.sendRedirect(request.getContextPath() + "/login.html");
			return false;
		}
		if (subject.getPrincipal() != null) {
			printMsg(request, response);
			return false;
		}
		return super.onAccessDenied(servletRequest, servletResponse);
	}

	/**
	 * 根据请求头判断是不是ajax请求
	 *
	 * @param request
	 *            请求实体
	 *
	 * @return
	 */
	/*
	 * private Boolean isAjax(HttpServletRequest request) { Boolean isAjax =
	 * request.getHeader("X-Requested-With") != null &&
	 * "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString());
	 * return isAjax; }
	 */

	/**
	 * 判断用户是否可以访问请求的资源
	 *
	 * @param request
	 *            用户请求
	 *
	 * @param response
	 *            响应
	 *
	 * @param mappedValue
	 *
	 * @return
	 *
	 * @throws Exception
	 */
	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {
		// 登陆请求直接放行
		if (isLoginRequest(request, response)) {
			return true;
		}

		// 获取用户认证信息
		Subject subject = getSubject(request, response);
		if (!subject.isAuthenticated()) {
			HttpServletRequest httpServletRequest = (HttpServletRequest) request;
			HttpSession session = httpServletRequest.getSession();
			String requestUrl = httpServletRequest.getRequestURL().toString();
			session.setAttribute("lastUrlKey", requestUrl);
			return false;
		}

		// 判断请求资源是否授权(如果项目不需要授权，下面省略，直接return true)
		/*
		 * String resource = getPathWithinApplication(request); if
		 * (subject.isPermitted(resource)) { return true; }
		 */
		return true;
	}

	private void printMsg(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// 前端Ajax请求，则不会重定向
		// response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		// response.setHeader("Access-Control-Allow-Credentials", "true");
		// response.setCharacterEncoding("UTF-8");

		ResponseBean responseBean = new ResponseBean();
		responseBean.setStatus(ResponseStatusEnum.UNAUTHORIZED.getCode());
		responseBean.setMsg("Not logged in or authorized.");
		responseBean.success();

		PrintWriter writer = response.getWriter();
		writer.println(JSONObject.toJSONString(responseBean));
		writer.flush();
		writer.close();
	}
}
