package 集合类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection (收集接口)
 * @author 123
 *
 */

public class AaaCollection {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		System.out.println("集合是否为空："+c.isEmpty()+"集合中有几个元素："+c.size());
		c.add("12315153");
		c.add(123.213);
		c.add(new Object());
		Iterator it=c.iterator();//迭代
		while(it.hasNext()){//是否有下一个值
			Object obj=it.next();
			System.out.println(obj);
			
		}
	}
}
