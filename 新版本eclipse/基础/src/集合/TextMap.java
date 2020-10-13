package 集合;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map<K,V>集合
 * java.util.HashMap<K,V>集合 implements Map<K,V>
 * HashMap<K,V>集合的特点：
 * 		1.底层是哈希表，查询快
 * 			jdk1.8之间是  数组＋单向链表
 * 			jdk1.8之后是  数组＋单向链表/红黑树(链表的长度超过8)：提高查询速度
 * 		2.是一个无序的集合，储存元素与取出元素的顺序可能不一致
 * java.util.LinkedHashMap<K,V>集合 extends HashMap<K,V>
 * LinkedHashMap<K,V>的特点
 *      1.底层是哈希表＋链表(保证迭代的顺序)
 *      2.集合是一个有序的集合，存储与取出的顺序一致
 * @author 123
 *
 */
public class TextMap {
	public static void main(String[] args) {
		show1();
	}
	/*public V put(K k,V v);把指定的键与值添加到Map集合中
	 	返回值：v
	 		存储键值对的时候，key不重复，会返回null
	 		储存键值对的时候，key重复，会使用新的value替换map中的value，返回替换的value
	 		*/
	/*public V remove(K k,V v);删除指定键的元素
	  	返回值：v
	  		删除成功返回删除的键对应的值
	  		删除失败返回null
	 */
	/*public V get(K k);根据指定的键，获得对应的值
	 	返回值：v
	 		有则返回指定键对应的值
	 		没有返回null
	 */
	/*public boolean containsKey(K k);判断集合中是否包含指定的键
	 	返回值：boolean
	 		有返回true；
	 		无返回false；
     */
	public static void show1() {
		Map<String,String> m=new HashMap<>();
		String v1=m.put("李晨", "范冰冰1");
		System.out.println("v1	"+v1);
		
		String v2=m.put("李晨", "范冰冰2");
		System.out.println("v2	"+v2);
		
		System.out.println(m);//{李晨=范冰冰2}    重写了toString方法
		
		boolean b=m.containsKey("李晨");
		System.out.println(b);//true
		System.out.println(m);//{李晨=范冰冰2} 
	}
}
