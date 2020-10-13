package org.example;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.AccountDao;
import org.example.domain.AccountUser;
import org.example.domain.account;
import org.example.util.mybatisUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestAccountDao {
//    private SqlSession sqlSession;
//    @Before
//    public void init(){
//        sqlSession = mybatisUtil.getSqlSession();
//    }
//    @After
//    public void close(){
//        sqlSession.close();
//    }
//    @Test
//    public void testFindAll(){
//        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
//        List<account> all = mapper.findAll();
//        for (account a:all) {
//            System.out.println(a);
//        }
//    }
//    @Test
//    public void testFindAllAccount(){
//        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
//        List<AccountUser> allAccount = mapper.findAllAccount();
//        for (AccountUser a : allAccount) {
//            System.out.println(a);
//        }
//    }
//    @Test
//    public void testAFindAllAccount(){
//        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
//        List<account> accounts = mapper.aFindAllAccount();
//        for (account a:accounts) {
//            System.out.println(a);
//        }
//    }
}
