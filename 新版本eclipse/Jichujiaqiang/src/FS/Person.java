package FS;

import ע��.AnnotationDemo01;

public class Person {
	private String name;
	public static int age;

	public Person() {
	}

	private Person(String name) {// ����һ��˽�еĹ��췽�������ܱ��ⲿʹ��
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void add() {
		System.out.println("add=");
	}
	private void doc() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
