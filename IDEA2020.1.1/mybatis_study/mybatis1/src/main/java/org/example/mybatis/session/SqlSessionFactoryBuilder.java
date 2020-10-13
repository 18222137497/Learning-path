package org.example.mybatis.session;

import org.example.mybatis.cfg.Configuration;
import org.example.mybatis.defaults.DefaultSqlSessionFactory;
import org.example.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * 用于创建一个SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder{
    /**
     * 根据参数的字节输入流来创建一个SqlSessionFactory工厂
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        Configuration configuration = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(configuration);
    }

}
