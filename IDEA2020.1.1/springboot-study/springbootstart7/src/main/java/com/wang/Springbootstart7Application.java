package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync//开启异步注解支持
@EnableScheduling//开启定时功能的注解支持
public class Springbootstart7Application {
    /**
     * 定时任务
     * TaskScheduler 任务调度者
     * TaskExecutor 任务执行者
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Springbootstart7Application.class, args);
    }

}
