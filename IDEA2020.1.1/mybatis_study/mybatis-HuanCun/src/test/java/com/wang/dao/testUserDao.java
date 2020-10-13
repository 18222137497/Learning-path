package com.wang.dao;

import com.wang.domain.User;
import com.wang.util.mybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class testUserDao {
    private SqlSession sqlSession;
    @Before
    public void init(){
        sqlSession= mybatisUtil.getSqlSession();
    }
    @After
    public void close(){
        sqlSession.close();
    }
    @Test
    public void testFindAll(){
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> all = mapper.findAll();
        for (User u : all) {
            System.out.println(u);
            System.out.println(u.getAccounts());
            System.out.println("------------------------");
        }
    }
//    @Test
//    public void testFindOne(){
//        UserDao mapper = sqlSession.getMapper(UserDao.class);
//        User one = mapper.findOne(41);
//        System.out.println(one);
//    }
}
