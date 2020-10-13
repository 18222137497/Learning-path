package org.example.Dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.Domain.User;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserTest {
    @Test
    public void show() throws IOException {
        //1.地区配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        //3.使用工厂生产SqlSession对象
        SqlSession sqlSession = build.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        List<User> all = mapper.findAll();
        System.out.println(all);
        //6.释放资源
        sqlSession.close();;
        resourceAsStream.close();
//    }
    }


}
