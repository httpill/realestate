package com.yibayi;

import com.yibayi.core.permission.entity.Token;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.yibayi")
@MapperScan(basePackages = {"com.yibayi.dao.*","com.yibayi.core.temp.shiro.dao.*"})
@SpringBootApplication
public class YbySaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(YbySaleApplication.class, args);
    }

    @Bean
    @ConfigurationProperties("yibayi.token")
    public Token token(){
        return new Token();
    }

}
