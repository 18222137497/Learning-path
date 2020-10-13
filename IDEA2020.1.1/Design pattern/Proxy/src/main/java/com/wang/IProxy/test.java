package com.wang.IProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于接口的动态代理
 */
public class test {
    public static void main(String[] args) {
        /* 这里修饰被代理对象需要最终的修饰*/
        final ProxyFactory proxyFactory=new ProxyFactory();//todo way?
        /**
         * 动态代理：
         *      特点：字节码随用随创建，随用随加载
         *      作用：不用修改源码的基础上对方法进行增强
         *      分类：
         *          基于接口的动态代理
         *          基于子类的动态代理
         *    基于接口的动态代理：
         *      涉及的类：Proxy
         *      提供者：JDK官方
         *    如何创建代理对象：
         *      使用Proxy类中的newProxyInstance方法
         *    创建代理对象的要求：
         *      被代理类至少实现一个接口，如果没有则不能使用
         *    newProxyInstance方法的参数：
         *      ClassLoader：类加载器
         *          它是用于加载代理对象的字节码的，和被代理对象使用的相同的类加载器，固定写法
         *      Class[]：字节码数组
         *          他是用于让代理对象和被代理对象有相同的方法，固定写法
         *      InvocationHandler：用于提供增强的代码
         *          他是让我们写如何代理。我们一般都是写一个该类接口的实现类，但不是必须的
         *          此接口的实现类都是谁用谁写
         */
        Factory f=(Factory)Proxy.newProxyInstance(proxyFactory.getClass().getClassLoader(), proxyFactory.getClass().getInterfaces(), new InvocationHandler() {
            /**
             * 作用：执行被代理对象的任何接口方法都会经过该方法
             * 方法参数的含义
             * @param proxy 代理对象的引用 //todo 什么时候用？
             * @param method 当前执行的方法
             * @param args 当前执行方法所需要的参数
             * @return 和被代理对象方法有相同的返回值
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //1.获取方法的执行参数
                Float money=(Float) args[0];
                //提供增强的代码
                Object returnValue=null;
                //判断当前方法是不是销售
                if ("FactoryShow".equals(method.getName())){
                    returnValue=method.invoke(proxyFactory,money*0.6f);
                }else{
                    returnValue=method.invoke(proxyFactory,money);
                }

                return "xx";//todo 返回的是什么？
            }
        });
        f.ProxyShow(1000f);

    }
}
