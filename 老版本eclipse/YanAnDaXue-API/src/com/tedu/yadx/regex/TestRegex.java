 package com.tedu.yadx.regex;

import java.util.Arrays;

import org.junit.Test;

/**
 * 正则表达式
 * @author 123
 *
 */
public class TestRegex {
	/*
	 * 1、实际开发中经常需要对字符串数据进行一些复杂的匹配，查找，替换等操作，通过正则表达式可以实现字符串的复杂操作
	 * 2、正则表达式是一串特定字符组成一个“规则字符串”是描述文本规则的工具，正则表达式就是记录文本规则的代码
	 * 3.例如：
	 *  -正则表达式："[a-z]"表示a到z的任意字符
	 *  -正则表达式："[a-z]+"表示由一个或多个a到z组成的字符串
	 * 4.正则表达式                            说明文字
	 *    [abc]                            abc中任意一个字符
	 *    [^abc]                           除了abc外任意一个字符
	 *    [a-z]                            a,b.....z中任意一个字符
	 *    [z-zA-Z0-9]                      a~z、A~Z、0~9中任意一个字符
	 *    [a-z&&[^bc]]                     a-z中除了bc之外的任意一个字符
	 *    .                                任意一个字符
	 *    \d                               任意一个数字字符=[0-9]
	 *    \w                               任意一个单词字符=[a-zA-Z0-9_]
	 *    \s                               空白字符
	 *    \W                               非单词字符
	 *    \D                               非数字字符
	 *    \S                               非空白字符
	 *    x?                               表示0或者1个x(x表示任意正则表达式)
	 *    x*                               表示0个或任意多个x
	 *    x+                               表示1个或多个x
	 *    x{n}							   表示n个x
	 *    x{n,}                            表示n个或任意多个x
	 *    x{n,m}                           表示n个到m个x
	 * 5.分组“()”
	 *    分组：()表示分组，可以将一系列正则表达式看作一个整体，分组时可以使用“|”表示或关系
	 * 6.边界匹配
	 *    "^"如果出现在第一个位置表示字符串开始
	 *    "$"如果出现在最后一个位置表示字符串结束
	 * 二、matches方法
	 *    将一个字符串与正则表达式匹配，成功true 反之false
	 * 三、split方法（重要！）
	 *    String类的split方法，可以将字符串按照指定的分割符拆分成字符串数组 
	 *    String[] split(String regex)-参数为正则表达式，以正则表达式为分割符，将字符串分割为字符串数组     
	 *  练习：
	 *    1.将"Are you kidding me ?"字符串空格删除 
	 *    2.将100+200-150=150式子中数字全部取出并打印     
	 * 四、replaceAll方法
	 *   String类提供了用于字符串的替换
	 *    String replaceAll（String regex String replacement）
	 *    将字符串中匹配正则表达式regex字符串的替换replacement   
	 */
	//测试正则表达式：字符集合
	@Test
	public void testRegex3(){
		String regex1="[a-z]";
		String regex2="[^a-z]";
		String regex3="[a-z&&[^bc]]";
		String regex4="\\d";
		String regex5="\\D";
		String regex6="\\s";
		String regex7="\\S";
		String regex8="\\w";
		String regex9="\\W";

	}
	/*测试正则表达式："*","?","+"......*/
	public void textRegex1(){
		String regex1="[a-z]*";
		String regex2="\\w+\\.jar";
		String regex3="\\d?[a-z]*";
		System.out.println("abcde".matches(regex1));//.matches：判断是否在范围里
		
	}
	/*测试正则表达式:{n}{n,}{n,m}*/
	@Test
	public void testRegex2(){
		String regex1="\\w{5}";
		String regex2="\\d{5,}";
		String regex3="[a-zA-Z]{5,8}";
	}
	/*用split去空格*/
	@Test
	public void liaxi(){
		String a="Are you kidding me ?";
		String[] a1=a.split(" ");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	}
	/*将100+200-150=150中的数字全部取出并打印*/
	@Test
	public void lianxi(){
	String a="100+200-150=150";
	String b="(\\W)";
	String[] a1=a.split(b);
    System.out.println(Arrays.toString(a1));

	}
	/*
	 * 使用replaceAll方法实现字符串的替换
	 */
	@Test
	public void testReplaceAll(){
		//将str中所有的数字替换为“数字”二字
		String str="abc123bcd45ef6g7890";
		str=str.replaceAll("\\d+", "数字"); 
		System.out.println(str);
		
		
		
		
		
		
		
	}
}
