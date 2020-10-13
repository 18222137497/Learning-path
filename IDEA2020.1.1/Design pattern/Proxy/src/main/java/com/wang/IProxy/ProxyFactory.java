package com.wang.IProxy;

public class ProxyFactory implements Factory{

    @Override
    public void FactoryShow(Float money) {
        System.out.println("厂家价格"+money);
    }

    @Override
    public void ProxyShow(Float money) {
        System.out.println("代理商购买"+money);
    }
}
