package com.wang.JVM;

public class 对内存优化 {
    /**
     * 出现OOM可以给jvm扩容
     * 新生区会一直进行轻gc，当新生区满了之后jvm会进行一次重gc，将一部分对象放入老年区
     * @param args
     */
    public static void main(String[] args) {
        long l = Runtime.getRuntime().maxMemory();//返回虚拟机试图使用的最大内存
        long l1 = Runtime.getRuntime().totalMemory();//返回jvm的总内存
        System.out.println(" jvm的总内存="+l1/(double)1024/1024+"M\n 虚拟机试图使用的最大内存"+l/(double)1024/1024+"M");
        //-Xms1024m -Xmx1024m -XX:+PrintGCDetails 设置jvm的总内存为1024m(Xms),虚拟机试图使用的最大内存(Xmx)，并输出(有输出结果有计算误差)
        while (true){
            new Object();
        }
    }
}
