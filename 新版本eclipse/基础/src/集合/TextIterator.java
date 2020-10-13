package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util.Iterator迭代器
 * hasNext();是否有下一个
 * public Iterator<S> next();输出下一个
 * @author 123
 *
 */
public class TextIterator {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("张三");
		c.add("李四");
		c.add("王五");
		c.add("赵六");
		Iterator<String> i=c.iterator();
		while(i.hasNext()) {
			String a=i.next();
			System.out.println(a);
		}
		/*也可以使用增强for循环：for each*/
		//for(String arr:c){
		//	System.out.println(arr);
		//}
	}
}
