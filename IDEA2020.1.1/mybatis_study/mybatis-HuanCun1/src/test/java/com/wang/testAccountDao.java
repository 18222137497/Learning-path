package com.wang;

import com.wang.dao.AccountDao;
import com.wang.domain.Account;
import com.wang.util.mybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class testAccountDao {
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
//        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
//        List<Account> all = mapper.findAll();
//        for (Account a : all) {
//            System.out.println(a);
//            System.out.println(a.getUsers());
//        }
//    }
//    @Test
//    public void testFindAll1(){
//        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
//        List<Account> all1 = mapper.findAll1();
//        for (Account a : all1) {
//            System.out.println(a);
//            System.out.println(a.getUsers());
//            System.out.println("------------------------------------");
//        }
//    }
    @Test
    public void testFindOne(){
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        Account one = mapper.findOne(1);
        System.out.println(one);
        System.out.println(one.getUsers());
    }
}
