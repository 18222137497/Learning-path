package com.wang.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class mybatisUtil {
    private static SqlSession SqlSession;
    static {
        try {
            SqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static org.apache.ibatis.session.SqlSession getSqlSession() {
        return SqlSession;
    }
}
