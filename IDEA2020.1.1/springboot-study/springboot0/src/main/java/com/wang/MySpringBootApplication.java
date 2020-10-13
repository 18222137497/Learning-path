package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//声明该类是一个springboot 的引导类
public class MySpringBootApplication {
    public static void main(String[] args) {//借助main启动程序。main是java程序的入口
        //run方法，表示运行springboot的引导类，参数就是引导类的字节码文件
        SpringApplication.run(MySpringBootApplication.class);
    }
}
