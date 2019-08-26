package com.yibayi.controller;

import bean.common.response.ResponseBean;
import bean.common.response.ResponseStatusEnum;
import com.yibayi.core.annotation.MustLogin;
import com.yibayi.core.redis.RedisService;
import com.yibayi.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.generator.IdGenerator;

import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    /**
     * 1.实现了注解声明指定接口请求必须登陆
     * 2.修改登陆存放token逻辑，配置二手房项目跨域cookie的接收，使用cookie多端统一获取登陆信息。
     * 3.BaseService中添加获取当前登陆人id的方法
     * 4.配置本地redis。通过cookie获取测试环境登陆token并通过本地redis模拟获取用户信息。
     * 测试了配置hosts文件local.181.com在过度环境同根域名不同二级域名的情况时，通过JavaScript请求本地服务
     * 获取配置了Domain为.181.com跨域cookie信息。并且成功从本地测试环境获取到redis数据使用mybatisplus获取用户信息。
     *   var xhttp = new XMLHttpRequest();
     *   xhttp.onreadystatechange = function() {
     *       console.log(this);
     *   };
     *   xhttp.open("POST", "http://local.181.com:8901/test/currentUser", true);
     *   xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
     *   xhttp.withCredentials = true;
     *   xhttp.send("");
     * */

    /**
     * 去读redis信息
     * */
    @GetMapping("/redis")
    public ResponseBean<String> getTestNumber(){
        RedisService.set("test", "123456");
        return new ResponseBean(RedisService.get("test"), null).success();
    }

    /**
     * mybatisplus获取用户
     * */
    @GetMapping("/user")
    public ResponseBean<String> nullApi(Long id){
        return new ResponseBean(userService.findUser(id), "获取用户信息成功").success();
    }

    /**
     * redis+mybatisplus获取用户
     * */
    @GetMapping("/currentUser")
    public ResponseBean<String> currentUser(){
        //通过测试环境置业前端获取的cookie信息模拟在本地redis存放用户id再查出
        RedisService.set("21cedfa2-742f-40d3-bb51-d44139940efa-10195o343", "3");
        return new ResponseBean(userService.currentUser(), "获取用户信息成功").success();
    }

    /**
     * 返回空
     * */
    @GetMapping("/null")
    public ResponseBean<String> nullApi(){
        String a = null;
        return new ResponseBean(null).success();
    }

    /**
     * 响应处理逻辑返回失败
     * */
    @GetMapping("/failed")
    public ResponseBean<String> failed(){
        return new ResponseBean(ResponseStatusEnum.FAILED).failed();
    }

    /**
     * 运行报错测试是否返回平台约定正确响应格式
     * */
    @GetMapping("/runtimeException")
    public ResponseBean<Integer> runtimeException(){
        throw new RuntimeException("运行时异常");
    }

    /**
     * @MustLogin 强调需要登陆的接口
     * */
    @MustLogin
    @GetMapping("/mustLogin")
    public ResponseBean<Integer> mustLogin() throws TimeoutException {
        throw new TimeoutException("超时异常");
    }
}
