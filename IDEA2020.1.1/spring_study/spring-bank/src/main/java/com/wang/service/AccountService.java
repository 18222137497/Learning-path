package com.wang.service;

import com.wang.domian.Account;

import java.util.List;

public interface AccountService {
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
     * 转账
     * @param sourceName
     * @param targetName
     * @param money
     */
    void zhuanzhang(String sourceName,String targetName,Float money);
}
