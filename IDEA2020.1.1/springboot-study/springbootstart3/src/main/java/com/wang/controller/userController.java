package com.wang.controller;

import com.wang.dao.UserDao;
import com.wang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.List;

@Controller
public class userController {
    @Autowired
    private UserDao userDao;
    @RequestMapping("findAll")
    @ResponseBody
    public Collection<User> findAll(){
        List<User> all = userDao.findAll();
        System.out.println(all);
        return all;
    }
}
