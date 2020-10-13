package com.wang.service.Impl;

import com.wang.dao.AccountDao;
import com.wang.domain.Account;
import com.wang.service.AccountService;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class AccountServiceImpl extends SqlSessionDaoSupport implements AccountService {
    @Override
    public List<Account> findAllAccount() {
        return getSqlSession().getMapper(AccountDao.class).findAllAccount();
    }
}
