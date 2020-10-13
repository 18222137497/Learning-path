package com.wang.service.imp;

import com.wang.service.AccountService;

import java.util.*;

public class AccountServiceImpl2 implements AccountService {
    private String[] arr;
    private List<String> list;
    private Set<String> strings;
    private Map<String,Integer> map;
    private Properties properties;

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getStrings() {
        return strings;
    }

    public void setStrings(Set<String> strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "AccountServiceImpl2{" +
                "arr=" + Arrays.toString(arr) +
                ", list=" + list +
                ", strings=" + strings +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    @Override
    public void Service() {
        System.out.println(this.toString());
    }

}
