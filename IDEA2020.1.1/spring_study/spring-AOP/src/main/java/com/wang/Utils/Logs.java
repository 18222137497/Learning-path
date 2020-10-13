package com.wang.Utils;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logs {
    /**
     * 用于打印日志，计划让其在切入点方法执行之前执行，(切入点方法就是业务层方法)
     * 前置通知
     */
    public void beforeLog(){
        System.out.println("前置通知执行了日志方法");
    }
    /**
     * 后置通知
     */
    public void afterReturningLog(){
        System.out.println("后置通知执行了日志方法");
    }
    /**
     * 异常通知
     */
    public void throwingLog(){
        System.out.println("异常通知执行了日志方法");
    }/**
     * 最终通知
     */
    public void afterLog(){
        System.out.println("最终通知执行了日志方法");
    }

    /**
     * 环绕通知
     * 问题：
     *      当我们配置了环绕通知之后，切入点方法没有执行，而通知方法执行了
     * 分析：
     *      通过对比动态代理中的环绕通知代码，发现动态代理的环绕通知有明确的切入点方法调用，而我们的代码中没有
     * 解决：
     *      Spring框架为我们提供了一个接口:ProceedingJinPoint。该接口有一个方法proceed()，此方法就相当于明确调用切入点方法
     *      该接口可以作为环绕通知的方法参数，在程序执行时，spring框架会为我们提供该接口的实现类供我们使用
     * spring中的环绕通知：
     *      他是spring框架位我们提供的一种可以在代码中手动控制增强方法何时执行的方法
     */
    public Object aroundLog(ProceedingJoinPoint proceedingJoinPoint) {
        Object rtValue = null;
        try {
            Object[] args = proceedingJoinPoint.getArgs();//得到方法执行所需的参数
            System.out.println("前置通知方法");
            proceedingJoinPoint.proceed(args);//明确调用业务层方法（切入点方法）
            System.out.println("后置通知方法");
            return rtValue;
        } catch (Throwable throwable) {
            System.out.println("警告通知方法");
            throw new RuntimeException(throwable);
        } finally {
            System.out.println("最终通知方法");
        }
    }


}
