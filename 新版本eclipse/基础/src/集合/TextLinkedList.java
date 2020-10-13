package 集合;

import java.util.LinkedList;

/**
 * java.util.LinedList    implements List接口
 * 	特点：
 * 		1.底层是链表
 * 		2.里面包含大量操作首位元素的方法
 * 		注意：使用LinkedList集合特有的方法，不能使用多态
 * 	public void push(E e);//将元素推入此列表所表示的堆栈,等效于addFirst
 * 	public E pop();//从此列表所表示的堆栈中弹出一个元素，等效于removeFirst
 * 	public boolean isEmpty();//如果列表不包含元素，则返回true
 * 	clear();//清空元素
 * @author 123
 *
 */
public class TextLinkedList {
	public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<>();
	l.add("1");
	l.add("2");
	l.push("3");//将元素存入第一个位置
	l.push("4");
	l.pop();//删除第一个元素
	System.out.println(l);
	}
}
