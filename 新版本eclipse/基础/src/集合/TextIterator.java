package ����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util.Iterator������
 * hasNext();�Ƿ�����һ��
 * public Iterator<S> next();�����һ��
 * @author 123
 *
 */
public class TextIterator {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("����");
		c.add("����");
		c.add("����");
		c.add("����");
		Iterator<String> i=c.iterator();
		while(i.hasNext()) {
			String a=i.next();
			System.out.println(a);
		}
		/*Ҳ����ʹ����ǿforѭ����for each*/
		//for(String arr:c){
		//	System.out.println(arr);
		//}
	}
}
