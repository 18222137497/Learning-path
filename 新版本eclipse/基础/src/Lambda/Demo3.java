package Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 使用数组储存多个person对象
 * 对数组中的person对象使用Arrays中的sort方法按照年龄升序排序
 * @author 123
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		Person[] p=new Person[]{
				new Person("迪丽热巴",18),
				new Person("古力娜扎",20),
				new Person("杨幂",11)
		};
//		Arrays.sort(p,new Comparator<Person>() {正常表达
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getAge()-o2.getAge();
//			}
//		});
		Arrays.sort(p,(Person p1,Person p2)->{//lambda方式表达（注意：点不出方法，只能干打印出来！！！）
			return p1.getAge()-p2.getAge();
		});
		for (Person person : p) {
			System.out.println(person);
		}
	}
}
class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person() {
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
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
}
