package �������Ա����ƪ;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ӵ�����
 * @author 123
 *
 */
public class ObjArrayList {
	public static void main(String[] args) {
		List<person> l=new ArrayList<person>();
		person p1=new person("��ɪ",13);
		person p2=new person("����",25);
		person p3=new person("��",15);
		person p4=new person("������",18);
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		System.out.println(l);//Ĭ��ΪtoString����
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

