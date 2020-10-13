package com.wang.dao.imp;

import com.wang.dao.UserDao;

import java.util.Arrays;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    private Integer age;
    private String name;
    private String[] names;
    private Map<String,Integer> map;
    @Override
    public void Save() {
        System.out.println("UserDaoImpl{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", names=" + Arrays.toString(names) +
                ", map=" + map +
                '}');
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

}
