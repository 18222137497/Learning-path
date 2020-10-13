package com.wang.service.Impl;

import com.wang.dao.AccountDao;
import com.wang.domain.Account;
import com.wang.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findOne(Integer id) {
        return accountDao.findOne(id);
    }

    @Override
    public void addOne(Account account) {
        accountDao.addOne(account);
    }

    @Override
    public void deleteOne(Integer id) {
        accountDao.deleteOne(id);
    }

    @Override
    public void updateOne(Account account) {
        accountDao.updateOne(account);
    }
}
