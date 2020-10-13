package com.wang.Factory;

import com.wang.service.AccountService;
import com.wang.service.Impl.AccountServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyService {
    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public AccountService getAccountService(){
        AccountService as=(AccountService)Proxy.newProxyInstance(AccountServiceImpl.class.getClassLoader(),AccountServiceImpl.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = null;
                if ("findAccountById".equals(method.getName())){
                    Integer f=(Integer) args[0];
                    invoke=method.invoke(accountService,f+1);
                }else {
                    invoke=method.invoke(accountService, args);
                }
                return invoke;
            }
        });
        return as;
    }
}
