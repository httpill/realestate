package com.yibayi.core.permission;

import com.yibayi.core.permission.entity.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登陆状态过滤器
 * @author guocy
 * 当前请求必须用户登陆时过滤登陆token有效性
 * */
@Component
@WebFilter(urlPatterns = "/*")
@Order(Integer.MIN_VALUE)
public class CrossTokenFilter implements Filter {

    @Autowired
    private Token token;

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String origin = request.getHeader("Origin");
        if(origin == null){
            origin = request.getHeader("Referer");
        }
        response.setHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Access-Control-Allow-Credentials", "true");
        String action = request.getHeader("SOAPAction");
    }

    public void destroy() {

    }
}
