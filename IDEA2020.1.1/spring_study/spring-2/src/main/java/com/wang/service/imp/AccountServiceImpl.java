package com.wang.service.imp;

import com.wang.service.AccountService;

import java.util.Date;

public class AccountServiceImpl implements AccountService {
    //如果时经常变化的数据，并不适合注入方式
    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public void Service() {
        System.out.println("Service1--name:"+name+"____age:"+age+"____birthday:"+birthday+"");
    }

}
