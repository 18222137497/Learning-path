package com.wang.JVM;

/**
 * 当一个对象经历了15次(默认可修改)gc还没有死，就会被放入养老区
 *      -XX:MaxTenuringThreshold=5  设置最大任期(存活)时间【进入老年代的时间】
 * 引用计数法：
 *          不好，计算机本身也会有消耗，每个对象用了几次就给计几次数，每个对象还要进行计数，增大计算机开销，一般jvm不用，不好
 *          有可能中间是去引用，而没办法进行-1，这样就无法变成0，无法被回收
 *          被引用的次数为0就会被回收
 * 标记清除法(两次扫描)：
 *      扫描这些对象：对活着的对象进行标记
 *      清除：对没有标记的对象进行清除
 *      优点：不需要额外的空间！
 *      缺点：两次扫描，严重浪费时间，会产生内存碎片
 * 标记-整理算法(三次扫描)：
 *      在标记清除法基础上再次扫描，排序对象，将被标记的对象排序到一边，但是又多了一部扫描
 *      优点就是可以清楚内存碎片
 * 复制算法：
 *      新生代主要用的是赋值算法，“谁空谁是to！！！”
 *      优点：没有内存的碎片
 *      缺点：浪费空间，多了一半空间是空的，对象越多就要复制越多，
 *      伊甸园区→to区(空的区,这里要将原来from区的所有对象都复制过来，使得from区变成to区)→(默认15次gc没有死)老年区
 *  JMM,volatile：如果想读就必须先加载，如果想储存就必须先写
 *
 *
 *  可达性分析法：
 *      -----------[GC ROOT]----------------
 *                 /
 *       可达→→    []    []  ←←不可达
 *               /  \    \
 *              []  []   []
 *       ------------------------------------
 *       可达的对象，虚拟机栈中引用的对象，
 *                方法区中的常量和静态变量
 *                本地方法栈中的对象
 *   分代回收算法：
 *       新生代（朝生夕死）：使用复制算法
 *       老年代：使用标记清清除，标记整理
 *
 */
public class GC问题 {
}
