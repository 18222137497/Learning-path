package com.tarena.yadx.accesscontrol;
/**
 * 面向对象的特征一-封装的编程方式
 * @author 123
 *
 */
public class Person1 {
	/*私有属性*/
	private String name;
	private int age;
	/*提供公共的setters和gatters方法*/
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

}
