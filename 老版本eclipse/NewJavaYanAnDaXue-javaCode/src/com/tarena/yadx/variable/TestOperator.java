package com.tarena.yadx.variable;

public class TestOperator {
	/*
	 * 一,使用%运算符
	 *    1.java算数运算符通常的加减乘除之外，
	 *    还包含取模运算%和自增自减
	 *    2.取模运算%意为取余数，可适用于整数，char及浮点数
	 * 二,使用++和--运算符
	 *    - 如果写在变量之前表示再使用这个变量之前加一或减一
	 *    - 如果写在变量之后表示再使用这个变量之后加一或减一
	 */
	public static void main(String[] args){
		int a=10,b=20;
		int c1=a++;
		int c2=++b;
		System.out.println("a="+a+",b="+b+",c1="+c1+",c2="+c2);//a=11,b=21,c1=10,c2=21
	 /*
	  * 三,关系运算符
	  *  关系元素安抚用于判断数据之前的大小关系，包括> < <= >= == !=。关系运算符运算结果为
	  *  boolean类型，如果成立位true，不成立为false
	  * 四,；逻辑运算
	  *  1,逻辑运算建立在关系运算的基础上，包括与&&，或||，非！
	  *  2参与逻辑运算的变量或表达式都是booblean类型
	  */
		int score=80;
		boolean z=score>=60&&score<90;
		System.out.println(z);
	/*
	 * 用户输出一个一个成绩
	 * 60-70及格
	 * 70-80良好
	 * 80-90中等
	 * 90-100优秀
	 */
		/*
		 * 五,短路逻辑问题
		 * java；逻辑运算遵循“短路逻辑”的原则
		 * -对于“&&”，当第一个操作数为false时，将不会判断后面的所有操作数，结果一定为false
		 * -对于“||”，当第一个操作数位true时，将不会判断后面的所有操作数，结果一定为true
		 */
		/*
		 * 六,使用=经行赋值运算
		 *    1,=称为赋值运算符用于对变量赋值关于赋值运算符，除了右边的表达式计算出来赋给左边以外还具有以下特点：
		 *    - 赋值表达式本身就有值，其本身值为所赋值
		 * 七,使用扩展赋值表达式
		 *    在赋值运算符=前加上其他运算符，即为扩展运算符
		 * 八,使用+经行字符串连接
		 *    +实现字符串连接同时可以实现字符串和其他数据类型的连接“相连”
		 */
		/*
		 * 九,使用三目运算符的嵌套
		 *       表达式：boolean表达式？表达式1：表达式2
		 *       2.运算符规则：
		 *        -先计a算boolen表达式
		 *        -如果为true，则执行表达式1
		 *        -如果为false，则执行表达式2
		 *        3三目运算的嵌套
		 *          表达式：boolean表达式？表达式1，表达式2中的表达式1和表达式2可以是三目运算符
		 */
		/*
		 * 练习2：接收用户输入一个年份，判断是否为闰年
		 * 注意：闰年的判断公式
		 *      1.年份能被4整除，且不能被100整除的时闰年
		 *      2.年份能被400蒸出的是闰年
		 *      要求使用三目运算符作答
		 *    时间：35分钟  
		 */
		
		
		
		
		
		
		
		
		
	}

}
