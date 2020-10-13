package 集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历：通过键找值的防式
 * Map集合中的方法：
 * 	Set<> keySet(),返回此映射中包含的键的Set视图
 * 	实现步骤：
 * 		1.使用Map集合中的方法keySet()，吧Map集合中的key取出来，存储到一个Set集合中
 * 		2.遍历set集合，获取Map集合中的每一个key
 * 		3.通过Map集合中的方法get(key)，通过key找value
 * @author 123
 *
 */
public class TextkeySet {
	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String, String>();
		m.put("杨幂", "古力娜扎");
		m.put("杨幂1", "古力娜扎1");
		m.put("杨幂2", "古力娜扎2");
		m.put("杨幂3", "古力娜扎3");
		Set<String> s=m.keySet();
		Iterator<String> i=s.iterator();
		while (i.hasNext()) {
			String ss=i.next();
			System.out.println(ss+" "+m.get(ss));
		}
		System.out.println("-------------------------------------");
		for(String sss:m.keySet()) {
			System.out.println(sss+" "+m.get(sss));
		}
		
	}
}
