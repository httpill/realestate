package com.yibayi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.yibayi.dao.*")
@SpringBootApplication
public class YbySaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(YbySaleApplication.class, args);
    }

}
