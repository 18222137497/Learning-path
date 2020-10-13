package 集合类;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map接口 Map集合
 *  TreeMap  和  HashMap
 *  一般都用HashMap，TreeMap不如另一个方便，且限制太多
 * @author 123
 *
 */
public class AadMap {
	public static void main(String[] args) {
	Map map=new HashMap();
	map.put("我", "强大");//put(key,value)可传任意形式
	map.put(1, 23);
	map.put(new Object(), new Object());
	System.out.println("map有几个元素："+map.size());
	Set set=map.keySet();//将map集合中的key集合存入集合中
	Iterator it=set.iterator();//map集合中没有迭代方法
	while(it.hasNext()){
		Object obj=it.next();//这个循环里只能放一个it.next()，否则会出现跌掉越界异常
		System.out.println("键="+obj+"	；值="+map.get(obj));
		
	}
	
}
}
