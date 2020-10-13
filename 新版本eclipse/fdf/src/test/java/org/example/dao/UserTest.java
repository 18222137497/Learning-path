package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.domain.User;
import org.example.util.mybatisUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class UserTest {
    private static SqlSession sqlSession;
    @Before
    public void open(){
        sqlSession=mybatisUtil.getSqlSession();
    }
    @After
    public void close(){
        sqlSession.close();
    }
//    @Test
//    public void testFindAll(){
//        UserDao mapper = sqlSession.getMapper(UserDao.class);
//        List<User> all = mapper.findAll();
//        System.out.println(all);
//    }
    @Test
    public void testSaveUser(){
        User user = new User();
        user.setName("望京");
        user.setUsername("123456789");
        user.setPassword("2132123132");
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.saveUser(user);
        sqlSession.commit(true);

    }


}
