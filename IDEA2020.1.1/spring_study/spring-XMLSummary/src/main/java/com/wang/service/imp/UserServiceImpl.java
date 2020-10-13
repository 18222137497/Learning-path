package com.wang.service.imp;

import com.wang.dao.UserDao;
import com.wang.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void init(){
        System.out.println("0对象创建了");
    }
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
