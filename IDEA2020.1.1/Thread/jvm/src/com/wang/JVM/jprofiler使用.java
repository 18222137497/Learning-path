package com.wang.JVM;

import java.util.ArrayList;
// Xms1m(设置初始化内存分配大小,默认是cpu的1/64)
// Xmx1m(设置最大分配内存，默认是cpu的1/4)
// -XX:+PrintGCDetails  //打印gc垃圾回收信息
// -XX:HeapDumpOnOutOfMemoryError   //oom Dump
public class jprofiler使用 {
    byte[] array =new byte[1*1024*1024];//1m
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        int count=0;
        try {
            while (true) {
                objects.add(new jprofiler使用());
                count++;
            }
        }catch (Throwable e){
            System.out.println(count);
            e.printStackTrace();
        }
    }
}
