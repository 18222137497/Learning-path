package com.tarena.yadx.brench;

import java.lang.invoke.SwitchPoint;

public class TestIf {
	public static void main(String[] args) {
		
	
     /*
      * 1.任何复杂的程序逻辑都可以通过“顺序”，“分支”，“循环”三种基本的程序结构实现
      * 2.什么是分支结构
      *   -当条件满足时执行某些语句if
      *   -当条件不满足实执行另一些语句if else
      * 3.if(逻辑表达式){
      *      语句一；
      *      语句二；
      *      }
      *      .若逻辑表达式为true，则执行代码体
      *      .若为flase，则不执行 
      *   当if语句块中只有一条语句时{}可以省略
      *   但当将来代码发生变更时很容易产生错误，因此即便if只有一条语句也要加{}。
      * 4.switch case语句执行逻辑
      *   1.switch case语句是一种特殊的分支结构，可以根据一个整数表达式的不同取值，从不同的入口开始执行
      *   2.通常case1,case2。。casen对应完全不同的操作，可以和break语句配合操作，执行完相应语句后推出
      *     switch块，不执行后面语句 
      * 5.swiitch case优势
      *    .switch case常常和dreak语句结合使用实现分支功能。
      *    .switch case实现分支功能时和if else的主要区别在于switch case结构清晰效率高    
      *    .从jdk7.0开始switch支持字符串表达式  
      */
	int num=3;
	switch(num){
	case 1:
		System.out.println("1.....");
		break;
	case 2:
		System.out.println("2.....");
		break;
	case 3:
		System.out.println("3.....");
		break;
		
	}
	}
	
}
