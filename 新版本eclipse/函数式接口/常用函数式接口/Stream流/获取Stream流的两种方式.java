package Stream流;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

/*
 * static <T> Stream<T> of(T... values) 返回其元素是指定值的顺序排序流 
 * Collection<T>集合中有.stream方法，
 * Map<T,T>集合中没有.stream方法，需要间接导入
 */

public class 获取Stream流的两种方式 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		Stream<String> s1=a.stream();
		
		Set<String> s=new HashSet<String>();
		Stream<String> s2=s.stream();
		
		Collection<String> c=new ArrayList<String>();
		Stream<String> s3=c.stream();
		
		Map<String, String> m=new HashMap<String, String>();
		Set<String> kets=m.keySet();//获取键的列表
		Stream<String> s4=kets.stream();
		Collection<String> c1=m.values();//获取值的列表
		Stream<String> s5=c1.stream();
		Set<Entry<String, String>> ss = m.entrySet();//注意类型
		Stream<Entry<String, String>> s6=ss.stream();//注意泛型
	}
}
