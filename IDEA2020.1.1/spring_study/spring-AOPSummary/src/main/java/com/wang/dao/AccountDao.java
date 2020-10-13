package com.wang.dao;

import com.wang.domain.Account;

import java.util.List;

public interface AccountDao {
    /**
     * 查找所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 根据id查找
     * @param id
     * @return
     */
    Account findAccountById(Integer id);

    /**
     * 保存
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 根据id删除
     * @param id
     */
    void deleteAccountById(Integer id);
    /**
     * 根据name查找
     * @param name
     * @return
     */
    Account findAccountByName(String name);
}
