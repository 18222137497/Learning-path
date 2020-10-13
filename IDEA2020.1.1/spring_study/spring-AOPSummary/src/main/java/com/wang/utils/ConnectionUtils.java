package com.wang.utils;

import javax.sql.DataSource;
import java.sql.Connection;

public class ConnectionUtils {
    private ThreadLocal<Connection> connectionThreadLocal=new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    /**
     * 获取当前线程上的连接
     */
    public Connection getThreadConnection(){
        Connection connection;
        try{
            //先从本地线程(ThreadLocal)中获取Connection
            connection = connectionThreadLocal.get();
            //判断当前线程上是否有连接
            if (connection==null){
                //没有连接就从数据库连接池中拿一个
                connection=dataSource.getConnection();
                connectionThreadLocal.set(connection);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return connection;
    }
    /**
     * 解除方法(接触线程池和Connection的绑定)
     * 作用是让关闭的线程不在复用，而是返回到连接池中等待重新开启
     */
    public void removeConnection(){
        connectionThreadLocal.remove();
    }
}
