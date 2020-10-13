package Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ʹ�����鴢����person����
 * �������е�person����ʹ��Arrays�е�sort��������������������
 * @author 123
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		Person[] p=new Person[]{
				new Person("�����Ȱ�",18),
				new Person("��������",20),
				new Person("����",11)
		};
//		Arrays.sort(p,new Comparator<Person>() {�������
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getAge()-o2.getAge();
//			}
//		});
		Arrays.sort(p,(Person p1,Person p2)->{//lambda��ʽ��ע�⣺�㲻��������ֻ�ܸɴ�ӡ������������
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
