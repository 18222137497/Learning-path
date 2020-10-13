package com.wang.dao;

import com.wang.domain.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();
}
