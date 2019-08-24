package com.yibayi.core.advice;

import bean.common.response.ResponseBean;
import com.yibayi.core.exception.UnloggedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.concurrent.TimeoutException;

/**
 * Controller层增强
 * @author guocy
 * 自定义常见异常的捕获 - 方便系统正常返回响应体
 * */
@Slf4j
@RestControllerAdvice
public class ControllerAdvice {

    /**
     * 其他异常响应捕获
     * */
    @ExceptionHandler()
    public ResponseBean unloggedException(UnloggedException e){
        log.error(e.getMessage());
        return  new ResponseBean(null, "该请求需要用户登陆！").unlogged();
    }

    /**
     * 空指针异常响应捕获
     * */
    @ExceptionHandler()
    ResponseBean nullPointerExceptionHandler(NullPointerException e){
        log.error(e.getMessage());
        return new ResponseBean(null, e.getStackTrace()[0].getClassName() + ":" + e.getStackTrace()[0].getLineNumber() + "行，发生空指针错误！").failed();
    }

    /**
     * 超时异常响应捕获
     * */
    @ExceptionHandler()
    ResponseBean timeoutExceptionHandler(TimeoutException e){
        log.error(e.getMessage());
        return new ResponseBean(null, "请求响应超时！").failed();
    }

    /**
     * 其他异常响应捕获
     * */
    @ExceptionHandler()
    public ResponseBean exceptionHandler(Exception e){
        log.error(e.getMessage());
        return  new ResponseBean(null, "请求未被正确响应！").failed();
    }
}
