package com.tarena.yadx.state;

public class Son extends Father{
	void showMe(){
		System.out.println("Son..showMe");
	}
public static void main(String[] args) {
	Father f=new Father();
	f.showMe();
	Son s=new Son();
	s.showMe();
	Father f1=new Son();
	f1.showMe();
	Son s1=(Son)f1;
	s1.showMe();
	System.out.println(s1 instanceof Father);
	System.out.println(s1 instanceof Son);
	System.out.println(f1 instanceof Father);
	System.out.println(f1 instanceof Son);
	System.out.println(s instanceof Father);
	System.out.println(f instanceof Father);
	System.out.println(f instanceof Son);
}
}
