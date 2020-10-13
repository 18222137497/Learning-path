package com.wang.factory;

import com.wang.dao.UserDao;
import com.wang.dao.imp.UserDaoImpl1;
import com.wang.service.imp.UserServiceImpl;
import com.wang.service.imp.UserServiceImpl1;

/**
 * 模拟一个静态工厂类（该类可能是存在于jar包中的，我们无法通过修改源码的方式来提供默认构造函数）
 */
public class staticFactory {

    public static UserDaoImpl1 getAccountService(){
        return new UserDaoImpl1();
    }
}
