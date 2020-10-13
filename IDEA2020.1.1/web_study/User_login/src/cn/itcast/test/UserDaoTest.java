package cn.itcast.test;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    public void testLogin(){
        User loginUser=new User();
        loginUser.setUsername("zhangsan");
        loginUser.setPassword("123");
        UserDao d=new UserDao();
        User user = d.login(loginUser);
        System.out.println(user);
    }
}