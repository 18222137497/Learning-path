package com.wang.Service.serviceImpl;

import com.wang.Service.AccountService;
import com.wang.dao.AccountDao;
import com.wang.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void find() {
        System.out.println("你好啊");
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
