package com.tarena.yadx.type;

public class TestChar {
	public static void main(String[] args) {
		/*
		 * 1.char类型
		 *        -字符类型事实上是一个十六位无符号整数，这个值是对应字符的编码
		 *        -java字符类型采用编码方式采用Unicode字符集编码
		 *                      Unicode是世界上通用的定长字符集，所有的字符都是16位
		 *        -字符直接量可以采用如中文中的“中”的形式，也可以采用16进制的表示形式：如'\u4e2d'              
		 *          
		 */
		char c1='中';
		char c2='\u4e2d';
		System.out.println(c1+"	"+c2);
		/*
		 * 2.对char型变量赋值
		 *   -字符直接量:'中'
		 *   -整数型直接量:0~65535之间的整数	
		 *   -Uncode形式：'\u0041',Unicode字16进制形式
		 *    	
		 */
		char c3='A';
		char c4=65;
		char c5='\u0041';
		System.out.println(c3+" "+c4+" "+c5);//A A A
		/*
		 * 3.使用转译字符
		 * \n:回车符
		 * \r:换行符
		 * \\:反斜杠
		 * \':单引号
		 * \":双引号
		 */
		System.out.println("\"");
		
		
	}

	

}
