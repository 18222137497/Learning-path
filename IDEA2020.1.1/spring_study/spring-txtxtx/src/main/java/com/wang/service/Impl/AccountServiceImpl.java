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
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public Account findAccountByName(String name) {
        return findAccountByName(name);
    }

    @Override
    public void deleteAccountById(Integer id) {
        accountDao.deleteAccountById(id);
    }

    @Override
    public void zhuanzhang(String AName, String BName, Float money) {
        Account A = accountDao.findAccountByName(AName);
        Account B = accountDao.findAccountByName(BName);
        A.setMoney(A.getMoney()-money);
        B.setMoney(B.getMoney()+money);
        accountDao.updateAccount(A);
        accountDao.updateAccount(B);
    }
}
