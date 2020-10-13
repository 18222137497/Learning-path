package com.wang.AProxy;

public class Producer{

    public void FactoryShow(Float money) {
        System.out.println("厂家价格"+money);
    }

    public void ProxyShow(Float money) {
        System.out.println("代理商购买"+money);
    }
}
