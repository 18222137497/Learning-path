package org.apache.dao;

import org.apache.domain.User;
import org.apache.domain.ZZ;
import org.apache.ibatis.session.SqlSession;
import org.apache.utils.mybatisUtil;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    private static SqlSession sqlSession = mybatisUtil.getSqlSession();
    private static UserDao mapper = sqlSession.getMapper(UserDao.class);
    @Test
    public void UserDaoTest() {
        List<User> all = mapper.findAll();
        System.out.println(all);
    }
    @Test
    public void testSave(){
        User user = new User("你好", "1234567898", "123456789");
        System.out.println(user);
        mapper.saveUser(user);
        //提交事务
        sqlSession.commit();
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1);
        user.setName("你好啊");
        user.setUsername("1234567898");
        user.setPassword("123456789");
        mapper.updateUser(user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testDelete(){
        mapper.deleteUser(52);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testSelect(){
        User user = mapper.selectUser(1);
        System.out.println(user);
    }
    @Test
    public void testFindLike(){
        List<User> a = mapper.findLikeUser("%啊%");
        for (User u : a) {
            System.out.println(u);
        }
        sqlSession.close();
    }
    @Test
    public void testFindTotal(){
        int total = mapper.findTotal();
        System.out.println(total);
        sqlSession.close();
    }
    @Test
    public void testFindByZZ(){
        User user = new User(3,"%好%" ,"1","1");
        ZZ zz = new ZZ();
        zz.setUser(user);
        List<User> userByZZ = mapper.findUserByZZ(zz);
        for (User u : userByZZ) {
            System.out.println(u);
        }
        sqlSession.close();
    }
}
