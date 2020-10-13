package com.tarena.yadx.type;

public class TestLong {
	public static void main(String[] args){
		
	
/*
 * 在表示整数时，如果int类型的范围不够，可以使用long型，一个long型的变量占用8个字节（64位）
 *                                           最大表示范围：-2^63~2^63-1
 * 2.如果要表示long的直接量，需要以L或者l结尾
 *    注意：如果直接量超过int范围的直接量且没加l，则编译错误  
 * 3.通过时间的毫秒数 来存储日期和时间
 *    JDK提供了System.currentTimeMillis()方法，返回的是1970年1月1日0点到此时此刻所经历的毫秒数
 *    其数据类型位long，该方法常用于计时操作                                              
 */
		long time=System.currentTimeMillis();		
		long a=100051561651l;
		long b=9841215215355l;
		int c=(int)(a*b/a*5315/100);
		System.out.println("	");
		long times=System.currentTimeMillis();
		System.out.println(times-time+"毫秒");//1000毫秒=1秒
		
		
		
		
		
		
		
		
		
		
}
}