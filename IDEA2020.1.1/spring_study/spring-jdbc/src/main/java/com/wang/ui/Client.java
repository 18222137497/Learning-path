package com.wang.ui;

import com.wang.dao.AccountDao;
import com.wang.service.AccountService;
import com.wang.uitl.Bean;

public class Client {
    public static void main(String[] args) {
        AccountService accountService =(AccountService) new Bean().getBean("accountService");
        accountService.Service();
    }
}
