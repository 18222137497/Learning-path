package org.example;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.IUserDao;
import org.example.domain.IUser;
import org.example.util.mybatisUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class TestUserDao {
    private SqlSession sqlSession;
    @Before
    public void init(){
        sqlSession = mybatisUtil.getSqlSession();
    }
    @After
    public void close(){
        sqlSession.close();
    }
    @Test
    public void testFindAll(){
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        List<IUser> all = mapper.findAll();
        for (IUser i : all) {
            System.out.println("------------------------");
            System.out.println(i);
            System.out.println(i.getAccounts());
        }
    }


}
