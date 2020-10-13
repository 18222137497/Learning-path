package 集合;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection           没有索引!
 * Collection中的共性方法（谁都能用，且一样）
 * 	clear(); 清空元素但不删除集合，
 *  contains(E e); 判断当前集合是否有这个对象
 *  isEmpty(); 判断集合是否为空
 *  size(); 返回集合中元素的个数
 *  public Object[] toArray(); 把集合中的元素存入数组中
 * @author 123
 *
 */
public class TextCollection {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("张三");//添加
		c.add("赵四");
		c.add("王五");
		c.add("赵六");
		c.add("张三");//ArrayList可以存重复的元素
		c.remove("张三");//删除
		System.out.println(c);
		System.out.println(c.contains("赵四"));//查找
		System.out.println(c.isEmpty());//是否为空
		System.out.println(c.size());//元素个数
		Object[] obj=c.toArray();//存入数组
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i]+"	");
		}
		System.out.println();
		c.clear();//清空元素
		System.out.println(c);
	}
}
