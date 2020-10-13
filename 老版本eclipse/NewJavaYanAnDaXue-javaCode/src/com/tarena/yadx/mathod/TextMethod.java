package com.tarena.yadx.mathod;

public class TextMethod {
	
		/*
		 * 一，方法（函数、过程）
		 *  1.各种语言都有方法的感念，有的语言称其为函数或者过程
		 *  2.方法用于封装一段特定的逻辑功能，如：执行计算，操作
		 *  3.方法可以在程序中反复被调用
		 *  4.方法可以减少代码重复，便于程序维护
		 * 二，方法的定义
		 *  1.public：公共的--访问修饰符(词)
		 *  static：静态的--只要是被static修饰的方法，可以直接使用（类名.方法名）的方式调用此方法
		 *  void：表示返回值类型-表示没有返回值类型 
		 *  main：方法的名字-小驼峰
		 *  (String[] args)：表示传入之个方法的参数，这个参数可以是零个，一个，多个，多个之间用“,”隔开
		 *  {}：这个方法的逻辑实现
		 *  2.public static int sum(int a,int b){}
		 *  public:
		 *  static:
		 *  int:返回值类型-可以是任何类型
		 *  sum:
		 *  (int a,int b):参数列表，称参数类表里的参数围殴形式参数，表示之中范围，限定传入参数的类型
		 *  {}:逻辑体
		 * 三，定义参数和返回值
		 *   1.方法的参数是指在调用时传递方法，需要被方法处理的数据
		 *   2.方法可有参数也可没有参数，有参可使方法处理更加的灵活
		 *   3.在方法定义时需要声明该方法所需要的参数变量
		 *   4.在调用方法时会将实际的参数值传递给方法的参数变量，必须保证传递参数的类型和个数符合方法的声明
		 *    例：void say(){}
		 *        void sat(String name){}
		 *        int sum(int a,int b,int c){}
		 *        int[] sort(int[] arr){}
		 *   5.方法调用结束后可以返回一个数据，称之为返回值
		 *   6.方法在声明时必须指定返回值类型，
		 *      -若方法不需要返回数据，将返回值类型声明为void
		 *      -若方法需要返回数据，将返回值声明为特定的数据类型
		 *     1.可通过return语句返回，return语句作用在于结束方法且将数据返回给调用方 
		 *     2.调用方法时的参数传递
		 *      -定义方法：
		 *      public static int sum(int a,int b){}
		 *      main方法调用:int result = sum(5,6)
		 *      -定义方法:
		 *      public static void sayHi(String name){}
		 *      main方法调用:sayHi("草原特")；  
		 *    重要声明！！！！   方法只能并列不能嵌套     
		 */
		
		/* 自定义sort排序方法*/
		/*
	 * 分析：排序的对象为数组 1.确定参数列表为数组类型 2.确定返回值类型为数组 3.确定语法体为冒泡排序+return语句 4.sortMy
	 */
	public static int[] sortMy(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int b = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = b;
				}
			}
		}
		return arr;
	}
}


