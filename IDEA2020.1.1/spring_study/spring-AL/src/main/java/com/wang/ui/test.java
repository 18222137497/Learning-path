package com.wang.ui;

import com.wang.domain.Account;
import com.wang.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = classPathXmlApplicationContext.getBean("accountService", AccountService.class);
        List<Account> all = accountService.findAll();
        for (Account a : all) {
            System.out.println(a);
        }

    }
}
