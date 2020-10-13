package Stream流;

import java.util.ArrayList;
import java.util.stream.Stream;

public class 集合元素处理Stream方式 {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("迪丽热巴");
		list1.add("宋远桥");
		list1.add("苏星河");
		list1.add("石破天");
		list1.add("石中玉");
		list1.add("老子");
		list1.add("孔子");
		list1.add("洪七公");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("古力娜扎");
		list2.add("张无忌");
		list2.add("赵丽颖");
		list2.add("张三丰");
		list2.add("尼古拉斯赵四");
		list2.add("张天爱");
		list2.add("张二狗");
		list2.add("韩炳旭");
		Stream.concat(list1.stream().filter(s->s.length()==3).limit(3), list2.stream().filter(s->s.startsWith("张")).skip(2)).forEach(s->System.out.println(new Person(s)));
				
	}
}
class Person{
	private static String name;
	public Person(String name) {
		this.name=name;
	}
	public String toString() {
		return "Person ["+name+"]";
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Person.name = name;
	}
}
