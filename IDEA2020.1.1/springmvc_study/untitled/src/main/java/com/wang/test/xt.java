package com.wang.test;

import com.wang.domain.Home;

import java.util.HashMap;
import java.util.Map;

public class xt {
    public static void main(String[] args) {
        Map<Home,String> map=new HashMap<>();
        map.put(Home.FATHER,"1");
        System.out.println(map);
    }
}
