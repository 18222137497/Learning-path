package 集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * java.util.Set  extends Collection
 * 	特点：
 * 		1.没有索引，不能用普通for循环遍历，可以使用foreach遍历
 * 		2.不允许存储重复的元素
 * 	HashSet特点：
 * 		1.是一个无序的集合，储存元素和取出元素的顺序可能不一致
 * 		2.底层是一个哈希表（查询的速度非常快）
 * @author 123
 *
 */
public class TextSet {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		Iterator<Integer> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for (Integer r : s) {//使用foreach遍历
			System.out.println(r);
		}
	}
}
