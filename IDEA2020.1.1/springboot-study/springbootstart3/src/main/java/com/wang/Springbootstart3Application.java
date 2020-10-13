package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.wang.dao")  扫描包
public class Springbootstart3Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootstart3Application.class, args);
    }

}
