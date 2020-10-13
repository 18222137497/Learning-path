package 集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map集合遍历的第二种方法：使用entry对象遍历
 * 
 * Map集合中的方法：
 * 	Set<Map.Entry<K,V>> entrySet()放回此映射中包含的映射关系的set视图。
 * 
 * 实现步骤：
 * 		1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来，存储到一个Set集合中
 * 		2.遍历Set集合，获取每一个Entry对象
 * 		3.使用Entry对象中的方法getKey()和getValue()获取键与值
 * @author 123
 *
 */
public class TextEntry {
	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String, String>();
		m.put("杨幂","古力娜扎");
		m.put("杨幂1","古力娜扎1");
		m.put("杨幂2","古力娜扎2");
		m.put("杨幂3","古力娜扎3");
		Set<Map.Entry<String, String>> s=m.entrySet();
		Iterator<Map.Entry<String,String>> i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<String, String> e=i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("---------------------------");
		for (Map.Entry<String, String> entry : s) {
			String z=entry.getKey();
			String x=entry.getValue();
			System.out.println(z+" "+x);
		}
		
	}
}
