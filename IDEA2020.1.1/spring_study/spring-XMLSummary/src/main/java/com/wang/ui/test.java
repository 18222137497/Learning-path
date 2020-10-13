package com.wang.ui;

import com.wang.service.imp.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("bean.xml");
        UserServiceImpl userService = cp.getBean("userService", UserServiceImpl.class);
        userService.Service();
        cp.close();
    }
}
