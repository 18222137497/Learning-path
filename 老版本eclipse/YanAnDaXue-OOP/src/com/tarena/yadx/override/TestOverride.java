package com.tarena.yadx.override;
/**
 * 重写
 * @author 123
 *
 */
public class TestOverride {
	/*
	 * 一、方法的重写
	 *   1.子类可以重写（覆盖）继承自父类的方法，即方法名和参数列表与父类方法相同，但方法的实现不同
	 *   2.当子类对象的重写方法被调用时，（无论是通过子类的引用还是父类的引用），运行的是子类的重写后的方法
	 * 二、重写中的super关键字
	 *   3.子类在重写父类方法时，可以通过super关键字调用父类的方法；
	 * 三、重写和重载的区别--面试题
	 *   1.重写与重载是完全不同的语法现象，区别如下：
	 *     -重载是指在一个类中定义多个方法名相同但参数列表不同的方法，在编译是根据参数的
	 *      个数和类型决定使用那个方法
	 *     -重写是指在子类中定义和父类完全相同的方法，在程序运行时根据对象的类型不同（不
	 *      是引用类型），而调用不同的方法
	 *   2.重载遵循所谓“编译器绑定”，即在编译时根据参数变量的类型判断应该调用那个方法；
	 *     因为：变量obj的类型为supclass，所以subclass的dance(SuperClass obj)方法被调用  
	 *   3.重写遵循所谓"运行期绑定"，即在运行的时候根据引用变量指向的十几对象类型调用方法；
	 *     因为obj实际指向的时子类的对象，因此，子类重写后的sing方法被调用，且子类重
	 *     写后的方法中使用了super关键字，所以先打印父类的sing方法
	 * 
	 */

	public static void main(String[] args) {
//		 SubClass subc=new SubClass();
//		 SuperClass supc=new SubClass();
//		 subc.sing();
//		 supc.sing();
		SuperClass supc=new SubClass();
		SubClass subc=new SubClass();
		subc.dance(supc);
		
		
	}
}
