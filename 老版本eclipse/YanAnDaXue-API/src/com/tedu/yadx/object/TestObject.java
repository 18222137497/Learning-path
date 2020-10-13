package com.tedu.yadx.object;

import org.junit.Test;

/**
 * Object类
 * @author 123
 *
 */

public class TestObject {
	/*
	 * 一、Object
	 *  1.在java类继承中，java.long.Object类位于顶端     long包不用导包！！！！
	 *  2.如果定义一个java类时没有使用extends关键字声明其父类，则其中默认的父类为Object
	 *  3.Objcet类型的应用变量可以指向何类型
	 * 二、toString方法
	 *  1.Object中的重要方法用于返回对象值的字符串表现方式
	 *  2.原则上建议重写，格式大多数为："类的名字[域值]"
	 *  3.如何重写toSring方法
	 *   - java语言中很多地方默认调用对象的toString方法：
	 *    字符串+对象，自动调用对象的toString方法。
	 *    System.out.print(任意对象)，字节调用toString方法。
	 *   - 如果不重写toString方法，将使用object的toString方法，其逻辑为：
	 *    类名@散列码
	 *  4.toString方法是非常有用的调试工具。
	 *  5.jdk中的标准类库，许多类都定义了toString方法，方便用户获取有关对象状态的必要信息
	 *  6.强烈建议为自定义的每一个类都增加toString方法 
	 *  7.String类的toString方法就是返回自身
	 * 三、equals方法 
	 *  1.Object中的方法作用在于检测一个对象是否等于另一个对象
	 *  2.在Object，这个方法判断两个对象是否具有相同的引用即是否为相同的对象
	 *  3.在实际应用，一般需要重写该方法，通过比较对象的成员属性使该方法更具有意义
	 *  4.String重写equals方法
	 * 	String的equals方法用于比较两个字符串对象的字符序列是否相等
	 * 四、equals和==的区别（面试）
	 *  1.==用于比较两个变量的值，可以用于任何类型，如果引用类型比较的是两个引用变更两种存储的值（地址信息），判断两个对象是否能指向
	 *  2.equals是object的方法，重写以后可以比较俩个对象的内容是否相等
	 *  3.需要注意的是，如果不重写equals则与==具有相同的比较规则
	 */
	/*测试字符串的比较*/
	@Test
	public void Demo(){
		String s1=new String("abc");
		String s2=new String("abc");
		String s3=new String("A");
		System.out.println(s1.equals(s2));//比较字符是否相等
		System.out.println(s2.equals(s3));
		
	}
}
