package org.example.mybatis.defaults;

import org.example.mybatis.cfg.Configuration;
import org.example.mybatis.cfg.Mapper;
import org.example.mybatis.proxy.MapperProxy;
import org.example.mybatis.session.SqlSession;
import org.example.mybatis.utils.DataSourceUtil;

import javax.sql.DataSource;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

public class DefaultSqlSession implements SqlSession {
    private Connection connection;
    private Configuration cfg;
    public DefaultSqlSession(Configuration cfg) {
        this.cfg = cfg;
        connection= DataSourceUtil.getConnection(cfg);
    }
    /**
     * 用于创建代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    @Override
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        T t =(T) Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(), new Class[]{daoInterfaceClass}, new MapperProxy(cfg.getMappers(), connection));
        return t;
    }

    /**
     * 释放资源
     */
    @Override
    public void close() {

        if (connection!=null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
