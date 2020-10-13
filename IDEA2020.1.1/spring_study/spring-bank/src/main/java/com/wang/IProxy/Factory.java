package com.wang.utils;

import com.wang.service.AccountService;
import com.wang.service.Impl.AccountServiceImpl;
import com.wang.utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Factory {
    private AccountService accountService;
    private TransactionManager transactionManager;
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    /**
     * 获取Service代理对象
     */
    public AccountService getAccountService(){
        System.out.println("代理对象执行方法");
        AccountService as=(AccountService)Proxy.newProxyInstance(AccountServiceImpl.class.getClassLoader(), AccountServiceImpl.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object proxyReturn=null;
                try{
                    //开启事务
                    transactionManager.begin();
                    //执行操作
                    proxyReturn = method.invoke(accountService,args);
                    //提交事务
                    transactionManager.commit();
                    //返回结果
                    return proxyReturn;
                }catch (Exception e){
                    //回滚事务
                    transactionManager.rollback();
                    throw new RuntimeException(e);
                }finally{
                    //释放资源
                    transactionManager.release();
                }
            }
        });
        return as;
    }
}
