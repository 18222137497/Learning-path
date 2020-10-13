package org.example.dao;

import org.example.domain.AccountUser;
import org.example.domain.account;

import java.util.List;

public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
    List<account> findAll();

    /**
     * 查询所有用户，并带有用户的名称和地址信息
     * @return
     */
    List<AccountUser> findAllAccount();

    /**
     * 常用的多表查询方法
     * @return
     */
    List<account> aFindAllAccount();
}
