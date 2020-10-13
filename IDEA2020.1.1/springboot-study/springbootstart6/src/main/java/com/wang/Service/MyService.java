package com.wang.Service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
    }
}
