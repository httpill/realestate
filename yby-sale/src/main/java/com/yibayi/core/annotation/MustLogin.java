package com.yibayi.core.annotation;

import com.yibayi.core.annotation.impl.MustLoginImpl;

import java.lang.annotation.*;

/**
 * 必须登陆注解逻辑注解
 * @author guocy
 * 标注该方法执行前必须登陆
 * @see MustLoginImpl
 * */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MustLogin {
}
