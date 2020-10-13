package org.example.Dao;

import org.apache.ibatis.session.SqlSession;
import org.example.Domain.User;
import org.example.util.MybatisUtile;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //1.获得sqlSession对象
        SqlSession sqlSession = MybatisUtile.getSqlSession();
        //2.执行sql
        UserDao mapper = sqlSession.getMapper(UserDao.class);//获取执行对象
        List<User> all = mapper.findAll();//执行对象中的方法
        System.out.println(all);

    }
}
