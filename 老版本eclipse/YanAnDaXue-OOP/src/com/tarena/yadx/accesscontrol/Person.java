package com.tarena.yadx.accesscontrol;

public class Person {
	/*��Ա����*/
	private int x;
	private int y;
	/*���췽��*/
	public Person(int x,int y){
		this.x=x;
		this.y=y;
	}
	/*�Զ����Ա����*/
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
