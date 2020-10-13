package com.wang.utils;

import javax.sql.DataSource;
import java.sql.Connection;

public class ConnectionUtils {
    private ThreadLocal<Connection> connectionThreadLocal=new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setConnectionThreadLocal(ThreadLocal<Connection> connectionThreadLocal) {
        this.connectionThreadLocal = connectionThreadLocal;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 获取当前线程上的连接
     */
    public Connection getThreadConnection() {
        Connection connection;
        try {
            //先从ThreadLocal上获取
            connection = connectionThreadLocal.get();
            //判断当前线程上是否有连接
            if (connection == null) {
                connection = dataSource.getConnection();
                connectionThreadLocal.set(connection);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //返回当前线程上的连接
        return connection;
    }

    /**
     * 解绑方法(解除线程池和Connection的绑定)
     */
    public void removeConnection() {
        connectionThreadLocal.remove();
    }
}
