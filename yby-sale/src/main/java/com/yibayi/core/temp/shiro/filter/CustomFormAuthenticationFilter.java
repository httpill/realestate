package com.yibayi.core.temp.shiro.filter;

import bean.common.response.ResponseBean;
import bean.common.response.ResponseStatusEnum;
import com.alibaba.fastjson.JSONObject;
import com.yibayi.core.temp.redis.RedisClient;
import com.yibayi.core.temp.shiro.constents.ShiroConstants;
import com.yibayi.core.temp.shiro.po.AdminCustom;
import com.yibayi.core.temp.shiro.service.AdminService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 自定义拦截未登录或Session失效的用户
 * 
 * @author lwx
 */
public class CustomFormAuthenticationFilter extends FormAuthenticationFilter {

	protected Log logger = LogFactory.getLog(this.getClass());

	@Resource
	private RedisClient redis;

	@Autowired
	private AdminService adminService;

	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {

		// 针对一个浏览器只能登陆一个账号的BUG解决方法
		// 是否是登录地址
		if (isLoginRequest(request, response)) {
			// 是否是POST提交
			if (isLoginSubmission(request, response)) {
				// 继续身份验证
				return false;
			}
		}
		/*
		 * // 跨域 if (request instanceof HttpServletRequest) { if (((HttpServletRequest)
		 * request).getMethod().toUpperCase().equals("OPTIONS")) { return true; } }
		 */
		return super.isAccessAllowed(request, response, mappedValue);
	}

	/**
	 * 登录之前校验验证码
	 */
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		HttpServletRequest req = (HttpServletRequest) request;
		// 用户输入验证码
		String captcha = req.getParameter("captcha");
		// 用户输入验证码token
		String token = req.getParameter("token");
		// 账号
		String account = req.getParameter("account");
		// 密码
		String password = req.getParameter("password");
		// 验证失败，不再校验账号和密码
		if (!checkCaptcha(captcha, token)) {
			req.setAttribute("shiroLoginFailure", "CaptchaError");
			return true;
		} else if (StringUtils.isBlank(account) || StringUtils.isBlank(password)) {
			req.setAttribute("shiroLoginFailure", "ParameterError");
			return true;
		}
		// 验证码校验通过，执行默认验证
		return super.onAccessDenied(request, response);
	}

	/**
	 * 重写登录成功方法，返回JSON提示
	 */
	@Override
	protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request,
			ServletResponse response) throws Exception {
		// 登录成功，保存至Session
		HttpSession session = ((HttpServletRequest) request).getSession();
		String account = token.getPrincipal().toString();
		AdminCustom admin = adminService.getByAccount(account);
		session.setAttribute(ShiroConstants.CURRENT_USER, admin);

		ResponseBean responseBean = new ResponseBean();
		responseBean.success();
		responseBean.setStatus(ResponseStatusEnum.SUCCESS.getCode());
		responseBean.setMsg("Login success.");
		responseBean.setObj(admin);

		try {
			response.setCharacterEncoding("utf-8");
			PrintWriter writer = response.getWriter();
			writer.println(JSONObject.toJSONString(responseBean));
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 验证验证码
	 * 
	 * @param captcha
	 *            验证码
	 * @param token
	 *            验证码
	 */
	public boolean checkCaptcha(String captcha, String token) throws Exception {
		if (StringUtils.isBlank(captcha) || StringUtils.isBlank(token)) {
			return false;
		}
		String value = (String) redis.get(token);
		logger.info("【信息】验证码校验中... 用户输入验证码" + captcha + "，redis获取验证码" + value);
		// 验证通过
		if (captcha.equalsIgnoreCase(value)) {
			return true;
		}
		return false;
	}
}