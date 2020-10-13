package 集合类;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * set集合
 *   TreeSet
 *   TreeSet不能添加null值否则会报出空指针异常
 * @author 123
 *
 */
public class AacSetTreeSet {
	public static void main(String[] args) {
		Set set=new TreeSet();
		Person p1=new Person(1,20,"小强");
		Person p2=new Person(2,18,"阿舔");
		Person p3=new Person(3,10,"孤儿");
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
		if (o instanceof Person) {//o是否是p的实例
			p=(Person)o;
		}else {
			return -1;//-1指传入的参数比我本身小
		}
		int diff=this.id-p.id;//按照id排序
		if (diff!=0) {
			diff=diff/Math.abs(diff);//本身除以本身的绝对值，得到+1或者-1
		}
		return diff;//返回0或者1来排序
	}
	
	
	
}
