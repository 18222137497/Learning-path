package ���л���;

import java.io.Serializable;
/**
 * Serializable��ǽӿڣ�ֻ�������ã�û�������ǾͲ������л�
 * @author 123
 *
 */
public class Person implements Serializable{
	private static final long serialVersionUID=1L;
	//�Լ��������кţ����۱�������Ƿ������޸ģ����кŶ��ǲ���ģ������л������ʱ��Ͳ������InvalidClassException���кŲ�ͬ�쳣
	private String name;
	private int age;
	public Person() {
	}
	public Person(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
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
	
	
	
}
