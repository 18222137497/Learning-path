package com.wang.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class AopManager {
    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    /**
     * 前置通知：开启事务
     */
    public void beforeOpen(){
        System.out.println("开启事务");
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * 后置通知：提交事务
     */
    public void afterReturningCommit(){
        System.out.println("提交事务");
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * 异常通知：回滚事务
     */
    public void afterThrowingRollback(){
        System.out.println("回滚事务");
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * 最终通知：释放资源
     */
    public void afterClose(){
        System.out.println("释放资源");
        try {
            connectionUtils.getThreadConnection().close();
            connectionUtils.removeConnection();//将Connection对象从本地线程中剔除
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
