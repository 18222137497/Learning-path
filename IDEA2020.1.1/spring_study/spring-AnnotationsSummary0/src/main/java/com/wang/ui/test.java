package com.wang.ui;

import com.wang.service.UserService;
import com.wang.service.imp.UserServiceImpl;
import com.wang.service.imp.UserServiceImpl1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = cp.getBean("userService1", UserService.class);
        userService.Service();
        cp.close();
    }
}
