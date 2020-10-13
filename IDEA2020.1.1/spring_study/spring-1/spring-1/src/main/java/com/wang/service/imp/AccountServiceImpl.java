package com.wang.service.imp;

import com.wang.service.AccountService;

public class AccountServiceImpl implements AccountService {
    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }

    @Override
    public void Service() {
        System.out.println("Service");
    }

    public void AA(){
        System.out.println("对象关闭了");
    }
}
