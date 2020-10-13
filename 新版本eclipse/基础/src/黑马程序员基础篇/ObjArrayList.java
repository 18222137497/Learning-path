package 黑马程序员基础篇;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象添加到集合
 * @author 123
 *
 */
public class ObjArrayList {
	public static void main(String[] args) {
		List<person> l=new ArrayList<person>();
		person p1=new person("亚瑟",13);
		person p2=new person("闪闪",25);
		person p3=new person("凛",15);
		person p4=new person("虞美人",18);
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		System.out.println(l);//默认为toString方法
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		
		
		
	}

}
class person{
	private String name;
	private int age;
	public person() {
	}
	public person(String name,int age) {
		this.name=name;
		this.age=age;
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
		return "person [name=" + name + ", age=" + age + "]";
	}
	
	
}

