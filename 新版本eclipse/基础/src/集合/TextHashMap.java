package 集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap储存自定义类型的键值
 *  Map集合保证key是唯一的：
 *  	作为key的元素，必须重写HashCode和equals方法，以保证key的唯一性
 * @author 123
 *
 */
public class TextHashMap {
	public static void main(String[] args) {
		HashMap<Person1,String> m=new HashMap<Person1, String>();
		m.put(new Person1("女王", 18), "英国");
		m.put(new Person1("国王", 20), "法国");
		m.put(new Person1("总统", 30), "美国");
		m.put(new Person1("女王", 18), "埃及");
		Set<Map.Entry<Person1,String>> s=m.entrySet();
		Iterator<Map.Entry<Person1, String>> i=s.iterator();
		for(Map.Entry<Person1,String> entry:s) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
