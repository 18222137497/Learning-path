package com.tedu.yadx.string;

import org.junit.Test;

public class TextString {
	/*
	 * 一、String是不可变量
	 *  1.java.long.String使用了final修饰，不能被继承
	 *  2.字符串底层封装了字符数组针对字符数组进行操作的算法。
	 *  3.字符串一旦创建，对象永远无法改变，但是引用可以重新赋值
	 *  4.java字符串在内存中采用Unicode编码方式，任意字符对应两个字节的定长编码
	 * 二、String常量池！！！！！！！
	 *  1.为了提高程序性能，静态字符串在常量之中创建，并尽量使用一个对象，重用静态字符串
	 *  2.对于重复出现的字符串直接量，JVM会首先在常量池中查找，如果存在则返回该对象 
	 * 三、内存编码及长度
	 *   String在内存中采用Unicode编码，每个字符占用两个字节，任何一个字符无论是中文还是英文都算一个字符两个字节
	 * 四、使用indexOf实现检索
	 *  1.indexOf方法用以实现在字符串中检索另外一个字符串
	 *  2.String提供几个重载的indexOf方法
	 *  int indexOf(String str)-在字符串中检索str，返回其第一次出现的位置，如果没有检索到则返回-1；
	 *  int indexOf(String str,int fromIndex)-从字符串的fromIndex位置  
	 *  3.String 还定义有lastIndexOf方法：
	 *   int lastIndexOf(String str,int from)-str在字符串中出现多次时将返回最后一个出现的位置
	 * 五、charAt
	 *  1.String中定义有charAt方法，
	 *  char charAt(int index)-该方法用于返回字符串指定位置的字符，参数index表示指定的位置
	 *  
	 */
	/*测试常量值*/
	@Test
	public void testConstantPool(){
		String str1="hello";//放在常量值里
		//不会创建新的String对象，而是使用常量值中的对象
		String str2="hello";
		System.out.println(str1==str2);
		//使用new关键字会创建新String对象
		String str3=new String("hello");
		System.out.println(str1==str3);
	}
	/*测试String对象的长度*/
	@Test
	public void testLength(){
		String str1="hello";
		System.out.println(str1.length());
		String str2="你好，String";
		System.out.println(str2.length());
		
	}
	/*在一个字符串中检索另一个字符串*/
	@Test
	public void testIndexOf(){
		String str="i can because i think i can";
		int index=str.indexOf("can");
		System.out.println(index);
		index=str.indexOf("can",6);
		System.out.println(index);
		index=str.indexOf("Can");
		System.out.println(index);//返回-1
	}
	/*使用subString获取子串*/
	@Test
	public void testSubString(){
		String str="http://www.oracle.com";
		String subStr=str.substring(11,17);//前包后不包
		subStr=str.substring(7);//www.oracle.com
	}
	/*trim*/
	@Test
	public void testTrim(){//trim去除的是字符串两端的空格，不取除中间的空格！！！！
		String userName=" good man ";
		userName=userName.trim();
		System.out.println(userName.length());//8
		System.out.println(userName);//good man
	}
	/*charAt*/
	@Test
	public void testCharAt(){
		String str="whatisjava";
		char c=str.charAt(3);
		System.out.println(3);
		//遍历当前字符串str打印每一个字符
		for (int i = 0; i < str.length(); i++) {
			char b=str.charAt(i);
			System.out.print(b);
		
		}
	}
	/*startsWith&&endsWith*/
	@Test
	public void testStartsWithAndEndsWith(){
		String str="Thinking in java";
		System.out.println(str.endsWith("java"));//返回boolean类型true
		System.out.println(str.startsWith("T"));//true
		System.out.println(str.startsWith("thinking"));//false
	}
	/*大小写变化*/
	@Test
	public void tasrToUpperCaseAndToLowerCase(){
		String str="我喜欢java";
		str=str.toUpperCase();
		System.out.println(str);
		str=str.toLowerCase();
		System.out.println(str);
	}
	/*将其他类型转换为字符串类型*/
	@Test
	public void testValueOf(){
		double pi=3.1415926535;
		int value=123;
		boolean flag=true;
		char[] charArr={'a','b','c','d','e','f','g'};
		String str=String.valueOf(pi);
		System.out.println(str);
		str=String.valueOf(value);
		System.out.println(str);
		str=String.valueOf(flag);
		System.out.println(str);
		str=String.valueOf(charArr);
		System.out.println(str);
		
	}
}
