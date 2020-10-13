package com.wang.service.imp;

import com.wang.service.AccountService;

import java.util.Date;

public class AccountServiceImpl1 implements AccountService {
    //如果时经常变化的数据，并不适合注入方式
    private String name;
    private Integer age;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void Service() {
        System.out.println("Service--name:"+name+"____age:"+age+"____birthday:"+birthday+"");
    }

}
