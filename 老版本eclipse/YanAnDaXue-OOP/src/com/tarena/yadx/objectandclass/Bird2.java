package com.tarena.yadx.objectandclass;

public class Bird2 {
	
	String name;
	public void birdSing(){
		System.out.println("�Ȳ�������Զ��ɧ��");
		
	}
	public void birdSing(String name){
		System.out.println("�������ȥ������������");
	}
	public static void main(String[] args) {
		Bird2 b=new Bird2();
		b.birdSing();
		b.birdSing("����");
	}
}
