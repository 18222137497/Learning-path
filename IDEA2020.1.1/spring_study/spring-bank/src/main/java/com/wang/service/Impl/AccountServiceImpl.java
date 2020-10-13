package com.wang.service.Impl;

import com.wang.dao.AccountDao;
import com.wang.domian.Account;
import com.wang.service.AccountService;
import com.wang.utils.ConnectionUtils;
import com.wang.utils.TransactionManager;

import java.sql.Connection;
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
    public Account findAccountBuId(Integer id) {
            return accountDao.findAccountBuId(id);
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
    public void deleteAccountById(Integer id) {
            accountDao.deleteAccountById(id);
    }

    /**
     * 转账操作
     * @param sourceName 转账用户
     * @param targetName 收涨用户
     * @param money 钱数
     */
    @Override
    public void zhuanzhang(String sourceName, String targetName, Float money) {
            Account source = accountDao.findAccountByName(sourceName);
            source.setMoney(source.getMoney()-money);
            Account target = accountDao.findAccountByName(targetName);
            target.setMoney(target.getMoney()+money);
            accountDao.updateAccount(source);
            accountDao.updateAccount(target);
    }
}
