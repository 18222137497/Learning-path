package 集合类;

import java.util.ArrayList;
import java.util.List;

/**
 * List接口
 *    ArrayList 和 LinkedList
 * @author 123
 *
 */
public class AabList {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("0");
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.remove(4);
		System.out.println("集合是否为空："+l.isEmpty()+"集合的长度："+l.size());
		for (int i = 0; i < l.size(); i++) {
			System.out.println("索引为"+i+"的元素为："+l.get(i));
		}
		
		
		
		
		
	}

}
