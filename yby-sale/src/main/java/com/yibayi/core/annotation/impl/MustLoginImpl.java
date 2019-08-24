package com.yibayi.core.annotation.impl;

import com.yibayi.core.annotation.MustLogin;
import com.yibayi.core.exception.UnloggedException;
import com.yibayi.core.permission.entity.Token;
import com.yibayi.core.redis.RedisService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * 必须登陆注解逻辑实现类
 * @author guocy
 * 方法被@MustLogin注解时执行该逻辑实现类的校验逻辑
 * @see MustLogin
 * */
@Component
@Aspect
public class MustLoginImpl {

    @Autowired
    private Token token;

    @Autowired
    private RedisService redisService;

    @Pointcut("@annotation(com.yibayi.core.annotation.MustLogin)")
    public void MustLoginBinding() {
    }

    /**
     * 请求前置校验 - 必须保证请求时携带登陆token
     * */
    @Before("MustLoginBinding()")
    public void MustLoginChenk() throws UnloggedException {
        ServletRequestAttributes requestAttributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        Cookie[] cookies = request.getCookies();
        boolean haveToken = false;
        if(cookies != null){
            for (Cookie cookie : cookies) {
                if(token.getCookieName().equals(cookie.getName())){
                    String token = cookie.getValue();
                    Object obj = redisService.get(token);
                    if(obj != null){
                        haveToken = true;
                        break;
                    }
                }
            }
        }
        if(!haveToken){
            throw new UnloggedException();
        }
    }
}
