package org.example;

import org.apache.ibatis.session.SqlSession;
import org.example.Util.mybatisUtil;
import org.example.dao.UserDao;
import org.example.domain.QueryVo;
import org.example.domain.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestUserDao {
    private SqlSession sqlSession;
    private UserDao mapper;
    @Before
    public void init(){
        sqlSession = mybatisUtil.getSqlSession();
        mapper = sqlSession.getMapper(UserDao.class);
    }
    @After
    public void close(){
        sqlSession.close();
    }
//    @Test
//    public void testFindAll(){
//        List<User> all = mapper.findAll();
//        System.out.println(all);
//    }
//    @Test
//    public void testSaveUser(){
//        User user = new User();
//        user.setName("新的");
//        user.setUsername("1234516487");
//        user.setPassword("4212341651");
//        System.out.println(user);
//        mapper.saveUser(user);
//        sqlSession.commit();
//        System.out.println(user);
//    }
//    @Test
//    public void testFindUserByCondition(){
//        User user = new User();
//        user.setUsername("123456789");
//        List<User> userByCondition = mapper.findUserByCondition(user);
//        System.out.println(userByCondition);
//    }

    /**
     * 测试foreach标签的使用
     */
    @Test
    public void testFindUserInIds(){
        QueryVo queryVo = new QueryVo();
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,36);
        System.out.println(list);
        queryVo.setIds(list);
        List<User> userInIds = mapper.findUserInIds(queryVo);
        System.out.println(userInIds);
    }
}
