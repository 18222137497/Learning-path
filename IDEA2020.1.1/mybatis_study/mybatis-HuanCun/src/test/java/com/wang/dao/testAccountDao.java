//package com.wang.dao;
//
//import com.wang.domain.Account;
//import com.wang.util.mybatisUtil;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.List;
//
//public class testAccountDao {
//    private SqlSession sqlSession;
//    @Before
//    public void init(){
//        sqlSession= mybatisUtil.getSqlSession();
//    }
//    @After
//    public void close(){
//        sqlSession.close();
//    }
//    @Test
//    public void testFindAll(){
//        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
//        List<Account> all = mapper.findAll();
//        for (Account a : all) {
//
//            System.out.println(a);
//            System.out.println(a.getUsers());
//            System.out.println("-----------------------------------------------");
//        }
//    }
//}
