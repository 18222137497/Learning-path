package com.wang;

import com.wang.dao.UserDao;
import com.wang.domain.User;
import com.wang.util.mybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

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
//    @Test
//    public void testFindAll(){
//        UserDao mapper = sqlSession.getMapper(UserDao.class);
//        List<User> all = mapper.findAll();
//        for (User u : all) {
//            System.out.println(u);
//            System.out.println(u.getAccounts());
//        }
//    }
//    @Test
//    public void testFindAll1(){
//        UserDao mapper = sqlSession.getMapper(UserDao.class);
//        List<User> all1 = mapper.findAll1();
//        for (User u : all1) {
//            System.out.println(u);
//            System.out.println(u.getAccounts());
//            System.out.println("------------------------------------------------");
//        }
//    }
    @Test
    public void testFindOne(){
        //sqlSession.clearCache();   刷新缓存
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User one = mapper.findOne(45);
        System.out.println(one);
        System.out.println(one.getAccounts());
    }
}
