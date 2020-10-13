package com.tarena.yadx.accesscontrol;
/**
 * Static
 * @author 123
 *
 */
public class TestStatic {

	/*
	 *一、Static修饰成员变量
	 *  1.用Static修饰的成员变量不属于对象的数据结构
	 *  2.static变量是属于类的变量，通常可以使用类名来引用Static成员
	 *  3.static成员变量和类的信息一起存储在方法区中而不是在堆中，一
	 *    个类的static成员变量只有1份，无论该类创建了多少对象 
	 *二、static修饰方法
	 *  1.通常的方法都会涉及到对具体对象的操作，这些方法在调用时会隐式
	 *    传递对象的引用this    
	 *     p1.sing();  p1->this
	 *  2.static修饰的方法则不需要针对某些对象进行操作，其运行结果仅仅
	 *  与输入的参数有关，调用时直接使用类名
	 *       Person.sing();
	 *    在static修饰的方法中不能使用this关键字
	 *  3.由于static在调用时没有具体的对象因此在static方法中不能对非
	 *    static成员进行访问，static在于提供一些“工具方法”，！！静
	 *    态方法不能访问非静态方法。
	 * 三、static块
	 *  1.static块：属于类的代码块，在类加载期间执行的代码块，只执行一
	 *    次，可以用来在软件中加载静态资源
	 *    static{....} 
	 *      
	 */
	static{
		System.out.println("static块。。。");
	}
	public static void sing(){
		System.out.println("sing.....static....");
	}
	public void dance(){
		System.out.println("dance.......");
		
	}
}







