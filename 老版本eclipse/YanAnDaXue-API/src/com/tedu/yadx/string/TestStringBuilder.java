package com.tedu.yadx.string;
/**
 * StringBuilder封装可变字符串
 * @author 123
 *
 */

import java.awt.image.BufferedImage;

import org.junit.Test;
public class TestStringBuilder{
/*
	 * 一、StringBuilder封装可变字符串
	 *  1.StringBuilder对象创建后可以通过调用方法改变其封装的字符串序列
	 *  2.StringBuilder有如下常用的构造方法
	 *   public StingBuilder();
	 *   public StingBuilder(String str);
	 * 二、StringBuilder常用方法
	 *  以下方法的返回值都为StringBuilder
	 *    -append(String str):追加字符串
	 *    -insert(int dstIffser,String s):插入字符串
	 *    -delete(int start,int end):删除字符串
	 *    -replace(int start,int end,String str):替换字符串
	 *    -reverse():字符串反转
	 * 三、StringBuilder
	 *  1.StringBuilder的很多方法的返回值均为StringBuilder类型，这些方法的返回语句为：return this；
	 *  2.由于改变封装的字符序列后有返回了该对象的引用，可以按照如下简洁的方式书写代码：
	 *   buf.append("ibm")
	 *      .append("java")
	 *      .inser(3,oracle)
	 *      .replace(9,13,"JAVA")； 
	 * 四、StringBuilder总结
	 *  1.StringBuilder是可变字符串，字符串的内容计算，建议使用StringBuilder
	 *  2.java的字符串连接过程是利用StringBuilber实现的。
	 *    String s="AB";
	 *    String s1=s+"DE"+1;
	 *    String s1=new StringBuilber(s).appednd("DE").append(1).toString();
	 *  3.StringBuiber和StringBuffere                            （面试）
	 *   -StringBuffere是线程安全的，同步处理性能稍慢
	 *   -StringBuilber是非线程安全，并发处理的性能稍快
	 *             
	 */
	/*测试StringBuilder的append方法*/
	@Test
	public void testAppend(){//追加字符串
		StringBuilder buf=new StringBuilder("Programming Language");
		buf.append(":java").append(",php").append(",js").append("c#");
		System.out.println(buf);
		System.out.println(buf.toString());
	}
	/*测试StringBuilder的insert方法*/
	@Test
	public void testInsert(){//插入字符串
		StringBuilder buf=new StringBuilder("Programming Language");
		buf.insert(11, "A");
		System.out.println(buf);
	}
	/*测试StringBuilder的delete方法*/
	@Test
	public void testDelete(){//删除字符串
		StringBuilder buf=new StringBuilder("Programming Language");
		buf.delete(18, 19);
		System.out.println(buf);
	}
	/*测试StringBuilder的replace方法*/
	@Test
	public void testReplace(){//替换字符串
		StringBuilder buf=new StringBuilder("Programming Language");
		buf.replace(16, 19, "ccc");
		System.out.println(buf);
	}
	/*测试StringBuilder的reverse方法*/
	@Test
	public void testReverse(){//字符串反转
		StringBuilder buf=new StringBuilder("Programming Language");
		buf.reverse();
		System.out.println(buf);
	}
	
}
