package com.tarena.yadx.abstractclass;
/**
 * 抽象类
 * @author 123
 *
 */
public class TastAbstract {
	/*
	 * 练习一：
	 *  (1)建类Square 属性：c(周长)-私有的
	 *  方法：构造方法-参数c
	 *   double area(){}-计算其面积
	 *  (2)建类Circle 其他同上
	 * 练习二:
	 *  (1)根据周长算面积，我们可以将其共有属性和方法抽象提取为一个抽象类Shape
	 *  
	 *   
	 */
	/*
	 * 一、抽象方法和抽象类
	 *   1.由abstract修饰的方法为抽象方法，抽象方法只有方法的定义，没有方法的实现，用一个分号结尾。
	 *   2.一个类中如果包含抽象方法，该类就必须使用abstract关键字声明为抽象类
	 *   3.抽象类中必须最少由一个抽象方法但抽象类中可以有非抽象方法
	 *   4.如果一个类继承了抽象类，必须重写其抽象方法
	 * 二、抽象类不可以被实例化
	 *   1.即使一个类没有抽象方法，那么这个类也可以被定义为抽象类，且不能被实例化
	 *   2.abstract和fianl关键字不能同时修饰一个类，因为fianl关键字使得类不能被继承，而abstract类修饰的类如果不能继承则没有任何意义
	 *   3.一个类抽象后必须重写其抽象方法不同的子类，可以有不同的实现
	 * 三、抽象类的意义
	 *   1.为其子类提供一个公共类型
	 *   2.封装子类中的重复内容
	 *   3.定义有抽象方法，子类虽然有不同的实现，但方法的定义一定是一致的  
	 * 
	 *   
	 */

}
