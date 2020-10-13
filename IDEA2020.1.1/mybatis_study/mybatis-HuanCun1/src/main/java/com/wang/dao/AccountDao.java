package com.wang.dao;

import com.wang.domain.Account;
import com.wang.domain.User;

import java.util.List;

public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     * 延迟加载查询Account
     * @return
     */
    List<Account> findAll1();

    /**
     * 根据id查询Account
     * @return
     */
    Account findOne(Integer id);

    /**
     * 根据uid查询Account
     * @param uid
     * @return
     */
    List<Account> findOneByUid(Integer uid);
}
