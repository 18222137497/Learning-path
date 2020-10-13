package com.wang.service.imp;

import com.wang.dao.UserDao;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("userService1")
@Scope("prototype")
public class UserServiceImpl1 implements UserService {
    @Autowired//设置依赖注入
    @Qualifier("userDao1")//设置依赖注入对象的id
    private UserDao userDao;
    @PostConstruct
    public void init(){
        System.out.println("1对象创建了");
    }
    @PreDestroy
    public void close(){
        System.out.println("1对象销毁了");
    }
    @Override
    public void Service() {
        userDao.Save();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
