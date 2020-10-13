package com.wang.factory;

import com.wang.service.AccountService;
import com.wang.service.imp.AccountServiceImpl;

/**
 * 模拟一个静态工厂类（该类可能是存在于jar包中的，我们无法通过修改源码的方式来提供默认构造函数）
 */
public class staticFactory {

    public static AccountServiceImpl getAccountService(){
        return new AccountServiceImpl();
    }
}
