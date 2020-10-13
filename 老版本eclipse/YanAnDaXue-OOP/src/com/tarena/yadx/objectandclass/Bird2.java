package com.tarena.yadx.objectandclass;

public class Bird2 {
	
	String name;
	public void birdSing(){
		System.out.println("等不到的永远在骚动");
		
	}
	public void birdSing(String name){
		System.out.println("我想带你去浪漫的土耳其");
	}
	public static void main(String[] args) {
		Bird2 b=new Bird2();
		b.birdSing();
		b.birdSing("花花");
	}
}
