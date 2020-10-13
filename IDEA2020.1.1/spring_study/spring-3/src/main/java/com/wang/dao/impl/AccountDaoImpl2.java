package com.wang.dao.impl;

import com.wang.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 账户的持久层实现类
 */
@Repository("accountDao2")
public class AccountDaoImpl2 implements IAccountDao {
    public  void saveAccount(){
        System.out.println("accountDao2---------------------------");
    }
}
