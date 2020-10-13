package com.tarena.yadx.type;

import org.omg.Messaging.SyncScopeHelper;

public class TestDouble {
	public static void main(String[] args){
/*
 * 1.使用double进行浮点数运算
 *       -浮点数就是小数，包括float和double
 *       -double的精度是float的两倍
 *       -大多是场合使用的是double类型
 * 2.浮点数直接量是double类型
 *       -两种写法：
 *           -通常写法：3.14，0.1
 *           -科学记数法：1.25E2(1.25*10的二次方)，1.2e2
 *       -默认的浮点直接量为double型，如果需要表示float类型的直接量，需要加F或f
 * 3.double运算时会出现舍入误差
 *       -2进制系统中无法精确的表示1/10，就好像十进制种无法精确的表示1/3一样
 *       -所以，2进制表示10进制就会出现一些舍入误差，对于一些要求计算的场合会导致代码的缺陷                 
 */
	       double money=3.0;
	       double price=2.9;
	       System.out.println(money-price);
	       /*
	        * 如果需要精确的运算可以考虑放弃使用double或者float，而采用BigDecimal类实现
	        */
}
}