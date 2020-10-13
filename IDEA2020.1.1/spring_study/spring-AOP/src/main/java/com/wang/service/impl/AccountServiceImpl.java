package com.wang.service.impl;

import com.wang.service.AccountService;

public class AccountServiceImpl implements AccountService {
    @Override
    public void findAll() {
        System.out.println("查询方法");
    }

    @Override
    public void save() {
        System.out.println("保存方法");
    }

    @Override
    public void update() {
        System.out.println("更新方法");
    }
}
