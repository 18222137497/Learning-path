package com.wang.ui;

import com.wang.domain.Account;
import com.wang.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = classPathXmlApplicationContext.getBean("asp", AccountService.class);
//        List<Account> allAccount = accountService.findAllAccount();
        Account accountById = accountService.findAccountById(1);
//        System.out.println(allAccount);
        System.out.println(accountById);
    }

}
