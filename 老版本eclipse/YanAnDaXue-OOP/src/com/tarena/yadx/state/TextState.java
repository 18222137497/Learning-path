package com.tarena.yadx.state;
/**
 * 多态
 * @author 123
 *
 */
public class TextState {
	/*
	 * 一、多肽的意义
	 *   - 一个类型的引用指向不同的对象是会有不同的实现
	 *     学校成员emp1=new 老师()；
	 *     学校成员emp2=new 学生()；
	 *     emp1.完成工作();
	 *     emp2.完成工作();
	 *   - 同样一个对象造型成不同的类型会有不同的功能
	 *     班级成员 emp1=new 班长();
	 *     班干部 emp2=mew 班长();
	 *     emp1.完成工作();
	 *     emp2.完成工作(); 
	 * 二、向上造型
	 *   - 一个类的对象可以上上造型的类型有：父类类型、其实现的接口类型
	 *     java编译器会根据类型检查调用的方法是否匹配
	 *     Son s=new Son();
	 *     Father f=new Son();//向上类型
	 *     Father f=new Father();
	 * 三、强制转换
	 *   - 可以通过强制转换将父类类型变量转换为子类类型变量，前提是该变量指向的对象确实是子类类型
	 *     Son s=new Son();
	 *     Father f=new Father();
	 *     Son s=(Son)new Father();//向下造型  
	 *   - 也可以通过强制类型转化将变量转换为某种接口类型，前提是该变量指向的对象确实实现了该接口  
	 *   - 如果在强制类型转化的过程中出现了违背上述两个原则，将会抛出ClassCastException. 
	 * 四、instanceof关键字
	 *   - 在强制类型转换中，为了避免出现ClassCastException可以通过instanceof关键字判断某个引用指向的对象是否为指定类型   
	 */

}
