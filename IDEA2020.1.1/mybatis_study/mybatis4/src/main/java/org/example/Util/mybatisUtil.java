package org.example.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class mybatisUtil {
    private static SqlSession sqlSession;
    static {
        String uri="mybatis-config.xml";
        try {
            sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(uri)).openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession() {
        return sqlSession;
    }

}
