package com.wang.service;

import com.wang.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     * 根据id查询指定用户
     * @param id
     * @return
     */
    Account findOne(Integer id);

    /**
     * 添加一个
     * @param account
     */
    void addOne(Account account);

    /**
     * 删除一个
     * @param id
     */
    void deleteOne(Integer id);

    /**
     * 增加一个
     * @param account
     */
    void updateOne(Account account);
}
