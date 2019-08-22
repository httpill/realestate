package com.yibayi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.yibayi")
@MapperScan(basePackages = {"com.yibayi.dao.*","com.yibayi.core.temp.shiro.dao.*"})
@SpringBootApplication
public class YbySaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(YbySaleApplication.class, args);
    }

}
