package com.yibayi.core.exception;

import com.yibayi.core.advice.ControllerAdvice;
import lombok.Data;

import java.io.Serializable;

/**
 * 未登录异常
 * @author guocy
 * 自定义未登录异常 - 方便精准全局异常捕获
 * @see ControllerAdvice
 * */
@Data
public class UnloggedException extends Exception implements Serializable {

    private static final long serialVersionUID = 2764127642431057419L;

    private String message;

    public UnloggedException() {
    }

    public UnloggedException(String message) {
        super(message);
        this.message = message;
    }
}
