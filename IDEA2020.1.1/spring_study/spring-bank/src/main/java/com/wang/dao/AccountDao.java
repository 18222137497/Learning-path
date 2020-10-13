package com.wang.dao;

import com.wang.domian.Account;

import java.util.List;

public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 根据id查询一个
     * @param id
     * @return
     */
    Account findAccountBuId(Integer id);

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
     * 删除
     * @param id
     */
    void deleteAccountById(Integer id);

    /**
     * 根据name查找对象
     * @param name
     * @return
     */
    Account findAccountByName(String name);
}
