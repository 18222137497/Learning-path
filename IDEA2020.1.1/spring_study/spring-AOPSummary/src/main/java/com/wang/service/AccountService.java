package com.wang.service;

import com.wang.domain.Account;

import java.util.List;

public interface AccountService {
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
     * 根据name查找
     * @param name
     * @return
     */
    Account findAccountByName(String name);

    /**
     * 根据id删除用户
     * @param id
     */
    void deleteAccountById(Integer id);
    /**
     * 转账操作
     * @param AName
     * @param BName
     * @param money
     */
    void zhuanzhang(String AName,String BName,Float money);
}
