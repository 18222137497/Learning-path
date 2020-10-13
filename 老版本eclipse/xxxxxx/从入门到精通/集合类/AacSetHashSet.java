package 集合类;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set集合
 *   HashSet
 *   //当一个元素输入在集合里面之后，不要修改可能使它哈希值改变的属性
 *   此代码不涉及哈希值的排序，排序默认为元素下标
 * @author 123
 *
 */
public class AacSetHashSet {
	public static void main(String[] args) {
		Set set=new HashSet();
		Person1 p1=new Person1(1, "小强");
		Person1 p2=new Person1(2, "阿舔");
		Person1 p3=new Person1(3, "孤儿");
		Person1 p4=new Person1(4, "傻子");
		set.remove(3);//删除下标为三的元素
		set.add(p1);
		set.add(p2);
		set.add(p3);
		 
		System.out.println("集合的长度为："+set.size()+"集合是否为空："+set.isEmpty());
		Iterator it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

}
class Person1{
	int id;
	String name;
	public Person1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person1 [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person1 other = (Person1) obj;
		if (id != other.id)//将id作为唯一标识
			return false;
		return true;
	}
	
}
