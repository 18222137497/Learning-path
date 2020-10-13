package com.tarena.yadx.override;

public class SubClass extends SuperClass {
	@Override
	public void sing() {
		super.sing();
		System.out.println("subClass.....¼¦ÄãÌ«ÃÀ¡£¡£¡£");
	}
	public void dance(SuperClass obj){
		System.out.println("dance......1");
		obj.sing();
	}
	public void dance(SubClass obj){
		System.out.println("dance......2");
		obj.sing();
	}

	
}
