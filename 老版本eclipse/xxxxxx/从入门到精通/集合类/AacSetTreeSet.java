package ������;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * set����
 *   TreeSet
 *   TreeSet�������nullֵ����ᱨ����ָ���쳣
 * @author 123
 *
 */
public class AacSetTreeSet {
	public static void main(String[] args) {
		Set set=new TreeSet();
		Person p1=new Person(1,20,"Сǿ");
		Person p2=new Person(2,18,"����");
		Person p3=new Person(3,10,"�¶�");
		set.add(p1);
		set.add(p2);
		set.add(p3);
		System.out.println(set.size());
		Iterator it=set.iterator();
		for (int i = 0; i < set.size(); i++) {
			System.out.println(it.next());
		}
	}

}
class Person implements Comparable{
	int id;
	int age;
	String name;
	public Person( int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	public int compareTo(Object o) {
		Person p;
		if (o instanceof Person) {//o�Ƿ���p��ʵ��
			p=(Person)o;
		}else {
			return -1;//-1ָ����Ĳ������ұ���С
		}
		int diff=this.id-p.id;//����id����
		if (diff!=0) {
			diff=diff/Math.abs(diff);//������Ա���ľ���ֵ���õ�+1����-1
		}
		return diff;//����0����1������
	}
	
	
	
}
