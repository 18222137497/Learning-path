package com.wang.service.imp;

import com.wang.dao.UserDao;
import com.wang.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


@Service("userService0")//业务层的命名注解
@Scope("singleton")//设置单例还是多例
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao0")//导tomcat-annotations-api包的最简单的依赖注入的方法
    private UserDao userDao;
    @PostConstruct//在对象创建之前执行
    public void init(){
        System.out.println("0对象创建了");
    }
    @PreDestroy//在对象销毁的时候执行
    public void close(){
        System.out.println("0对象销毁了");
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
