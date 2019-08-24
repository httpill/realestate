package com.yibayi.controller;

import bean.common.response.ResponseBean;
import bean.common.response.ResponseStatusEnum;
import com.yibayi.core.annotation.MustLogin;
import com.yibayi.core.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.generator.IdGenerator;

import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/id")
    public ResponseBean<String> id(){
        return new ResponseBean(IdGenerator.create32BitUId(), null).success();
    }

    @RequestMapping("/redis")
    public ResponseBean<String> getTestNumber(){
        redisService.set("test", "123456");
        return new ResponseBean(redisService.get("test"), null).success();
    }

    @RequestMapping("/null")
    public ResponseBean<String> nullApi(){
        String a = null;
        return new ResponseBean(null).success();
    }

    @RequestMapping("/failed")
    public ResponseBean<String> failed(){
        return new ResponseBean(ResponseStatusEnum.FAILED).failed();
    }

    @RequestMapping("/runtimeException")
    public ResponseBean<Integer> runtimeException(){
        throw new RuntimeException("运行时异常");
    }

    @MustLogin
    @RequestMapping("/mustLogin")
    public ResponseBean<Integer> timeoutException() throws TimeoutException {
        throw new TimeoutException("超时异常");
    }
}
