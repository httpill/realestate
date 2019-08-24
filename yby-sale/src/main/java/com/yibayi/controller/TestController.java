package com.yibayi.controller;

import bean.common.response.ResponseBean;
import bean.common.response.ResponseStatusEnum;
import com.yibayi.core.annotation.MustLogin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.generator.IdGenerator;

import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/getTestNumber")
    public ResponseBean<Integer> getTestNumber(){
        return new ResponseBean(1, null).success();
    }

    @RequestMapping("/runtimeException")
    public ResponseBean<Integer> runtimeException(){
        throw new RuntimeException("运行时异常");
    }

    @RequestMapping("/timeoutException")
    public ResponseBean<Integer> timeoutException() throws TimeoutException {
        throw new TimeoutException("超时异常");
    }

    @RequestMapping("/id")
    public ResponseBean<String> id(){
        return new ResponseBean(IdGenerator.create32BitUId(), null).success();
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
}
