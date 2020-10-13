package com.wang.dao;


import com.wang.domain.Account;
import java.util.List;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 */
public interface AccountDao {

    /**
     * 查询所有账户，同时还要获取到当前账户的所属用户信息
     * @return
     */
    List<Account> findAll();

    /**
     * 查询一个
     * @param id
     * @return
     */
    List<Account> findById(Integer id);

    List<Account> findByUid(Integer uid);
}
