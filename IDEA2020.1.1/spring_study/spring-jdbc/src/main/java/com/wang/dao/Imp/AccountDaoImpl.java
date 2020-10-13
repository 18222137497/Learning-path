package com.wang.dao.Imp;

import com.wang.dao.AccountDao;

public class AccountDaoImpl implements AccountDao {
    public AccountDaoImpl() {
    }
    @Override
    public void findAll() {
        System.out.println("findAll");
    }
}
