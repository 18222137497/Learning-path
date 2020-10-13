package API第二部分;

import java.util.Objects;

public class Object {
	public static void main(String[] args) {
		Person p1=new Person("汪京",21);
		Person p2=new Person("汪京", 21);
		boolean a=Objects.equals(p1,p2);//Objects.equals方法可以防止出现比较的空指针异常，具体查看源码		
		System.out.println(a);
	}
}
class Person{
	String name ;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public boolean equals(java.lang.Object obj) {//重写equals方法
		if (this == obj)//提高代码效率
			return true;
		if (obj == null)//提高代码效率
			return false;
		if (getClass() != obj.getClass())//反射
			return false;
		Person other = (Person) obj;//向下转型：防止多态造成的不能调用子类的属性以及方法的问题
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}