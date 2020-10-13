package com.wang.ui;


import com.wang.service.AccountService;
import com.wang.service.imp.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        //1.获取核心容器对象
        ClassPathXmlApplicationContext as = new ClassPathXmlApplicationContext("bean.xml");

        //获取Object对象，自己强转
        AccountServiceImpl accountService = as.getBean("accountService", AccountServiceImpl.class);

        //传入字节码，让他通过字节码强转类型
        System.out.println(accountService);
    }
}
