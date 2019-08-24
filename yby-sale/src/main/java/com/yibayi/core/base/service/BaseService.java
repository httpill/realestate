package com.yibayi.core.base.service;

import com.yibayi.core.exception.UnloggedException;
import com.yibayi.core.permission.entity.Token;
import com.yibayi.core.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class BaseService {

    @Autowired
    private Token token;

    @Autowired
    private RedisService redisService;

    protected Long currentId() {
        ServletRequestAttributes requestAttributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for (Cookie cookie : cookies) {
                if(token.getCookieName().equals(cookie.getName())){
                    String token = cookie.getValue();
                    Object obj = redisService.get(token);
                    if(obj != null){
                        String currentId = (String) obj;
                        return Long.valueOf(currentId);
                    }
                }
            }
        }
        return -1L;
    }

}
