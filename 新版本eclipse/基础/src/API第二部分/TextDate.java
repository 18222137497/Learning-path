package API第二部分;

import java.util.Date;

/**
 * Date类
 * 中国在东八区 ，所以初始时间为1970-1-1-08:00:00
 * CST中国区
 * 一毫秒等于千分之一秒
 * @author 123
 *
 */
public class TextDate {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());//获取1970 1 1 08:00:00到现在的毫秒值
		demo1();
	}

	private static void demo1() {
		Date d=new Date();
		System.out.println(d);//重写了toString方法，打印的是当前日期
		long l=d.getTime();
		System.out.println(l);//获取当前时间毫秒值==System.currentTimeMillis();
	}
}
