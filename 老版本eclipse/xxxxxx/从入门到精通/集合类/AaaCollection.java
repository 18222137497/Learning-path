package ������;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection (�ռ��ӿ�)
 * @author 123
 *
 */

public class AaaCollection {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		System.out.println("�����Ƿ�Ϊ�գ�"+c.isEmpty()+"�������м���Ԫ�أ�"+c.size());
		c.add("12315153");
		c.add(123.213);
		c.add(new Object());
		Iterator it=c.iterator();//����
		while(it.hasNext()){//�Ƿ�����һ��ֵ
			Object obj=it.next();
			System.out.println(obj);
			
		}
	}
}
