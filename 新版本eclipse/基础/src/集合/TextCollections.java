package 集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collections工具类
 * 	addAll(Collection<T> a,T...elements)往集合中添加一些元素
 * 	shuffle(List<?> list)打乱集合顺序
 * 	sort(List<?> list)将集合按照默认的规则排序，默认为升序排序
 * 		自定义类的排序需要实现Comparable接口，重写compareTo方法
 * 	sort(List<?> list,Collection<? super T>)将集合按照指定的规则排序
 * 		Comparator与Comparable的区别
 * 			Comparator：相当于找一个第三方裁判比较两个
 * 			Comparable：自己和别人比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
 * @author 123
 *
 */
public class TextCollections {
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
//		l.add("a");
//		l.add("b");
//		l.add("c");
//		l.add("d");
//		l.add("e");
//		l.add("f");
		Collections.addAll(l, "a","b","c","d","e","f");//等价于上面代码
		System.out.println(l);
		Collections.shuffle(l);//打乱集合顺序
		System.out.println(l);
		ArrayList<Integer> m=new ArrayList<>();
		Collections.addAll(m, 1,2,3,4,6,8,9,6,4,3);
		System.out.println(m);
		Collections.sort(m);//将集合按照默认的规则顺序排序（升序），只能传List集合，不能传set集合
		System.out.println(m);
		Person1 p=new Person1("汪京",18);
		Person1 p1=new Person1("汪京1",17);
		Person1 p2=new Person1("b汪京2",21);
		Person1 p3=new Person1("a汪京2",21);
		ArrayList<Person1> pp=new ArrayList<Person1>();
		Collections.addAll(pp, p,p1,p2,p3);
		System.out.println(pp);
		Collections.sort(pp);//排序
		System.out.println(pp);
		Collections.sort(pp, new Comparator<Person1>() {
			@Override
			public int compare(Person1 o1, Person1 o2) {
				int aaa= o1.getAge()-o2.getAge();
				if (aaa==0) {
					aaa=o1.getName().charAt(0)-o2.getName().charAt(0);//比较名字第一个字符
				}
				return aaa;
			}
		});
		System.out.println(pp);
		
	}

}
