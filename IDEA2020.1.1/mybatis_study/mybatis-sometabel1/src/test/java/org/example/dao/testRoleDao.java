package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.domain.Role;
import org.example.util.mybatisUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class testRoleDao {
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
        RoleDao mapper = sqlSession.getMapper(RoleDao.class);
        List<Role> all = mapper.findAll();
        for (Role r :all) {
            System.out.println(r+"  "+r.getUsers());
            System.out.println("-------------------------------------");
        }
    }
}
