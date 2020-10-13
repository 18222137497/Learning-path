package com.wang.springbootstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//开始将所有资源全部导入，没有调用依赖的类不会生效，自动装配
public class SpringbootstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootstartApplication.class, args);
    }

}
