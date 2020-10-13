package com.tarena.yadx.objectandclass;

public class TestBird {
	public static void main(String[] args) {
		Bird a=new Bird();
		a.name="小鸟";
		a.color='红';
		a.breed="麻雀";
		a.weight=5.00;
		//对属性进行赋值
		System.out.println(a.name);
		System.out.println(a.color);
		System.out.println(a.breed);
		System.out.println(a.weight);
		String name=a.name;
		char color=a.color;
		String breed=a.breed;
		double weight=a.weight;
		//值传递
		a.show(name,color,breed,weight);//调用引用小鸟方法show
		
		
		
	}

}
