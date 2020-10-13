package 序列化流;

import java.io.Serializable;
/**
 * Serializable标记接口，只起标记作用，没有这个标记就不能序列化
 * @author 123
 *
 */
public class Person implements Serializable{
	private static final long serialVersionUID=1L;
	//自己定义序列号，无论本类后续是否再做修改，序列号都是不变的，反序列化本类的时候就不会出现InvalidClassException序列号不同异常
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
