package com.yibayi.core.temp.shiro.filter;

import bean.common.response.ResponseBean;
import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.session.SessionException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;

/**
 * shiro退出登录拦截器
 * 
 * @author lwx
 */
@Service
public class SystemLogoutFilter extends LogoutFilter {

	@Override
	protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
		// 在这里执行退出系统前需要清空的数据
		Subject subject = getSubject(request, response);
		// String redirectUrl = getRedirectUrl(request, response, subject);

		// Servlet3.0+
		// ServletContext context = request.getServletContext();
		HttpServletRequest req = (HttpServletRequest) request;
		ServletContext context = req.getSession().getServletContext();
		try {
			subject.logout();
			context.removeAttribute("error");
		} catch (SessionException e) {

			e.printStackTrace();
		}
		// issueRedirect(request, response, redirectUrl);
		ResponseBean responseBean = new ResponseBean();
		responseBean.success();
		responseBean.setMsg("Logout success.");

		PrintWriter writer = response.getWriter();
		writer.println(JSONObject.toJSONString(responseBean));
		writer.flush();
		writer.close();
		return false;
	}
}
