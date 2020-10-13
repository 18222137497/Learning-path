package com.tarena.yadx.accesscontrol;

public class Person {
	/*成员变量*/
	private int x;
	private int y;
	/*构造方法*/
	public Person(int x,int y){
		this.x=x;
		this.y=y;
	}
	/*自定义成员方法*/
	public void distanceX(Person p){
		System.out.println("distanceX.....");
	}
	public static void main(String[] args) {
		Person p1=new Person(1,2);
		Person p2=new Person(3,4);
		p1.x=100;
		p1.distanceX(p1);
	}
	

}
