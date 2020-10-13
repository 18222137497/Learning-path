package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync//开启异步注解支持
public class Springbootstart6Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootstart6Application.class, args);
    }

}
