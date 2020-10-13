package 方法的引用;

public class Person {
	private String name;
	public Person() {
	}
	public Person(String name) {
		this.name=name;
	}
	public static void pl() {
		System.out.println("静态成员方法pl");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
