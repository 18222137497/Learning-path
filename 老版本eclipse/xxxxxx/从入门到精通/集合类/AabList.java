package ������;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ӿ�
 *    ArrayList �� LinkedList
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
		System.out.println("�����Ƿ�Ϊ�գ�"+l.isEmpty()+"���ϵĳ��ȣ�"+l.size());
		for (int i = 0; i < l.size(); i++) {
			System.out.println("����Ϊ"+i+"��Ԫ��Ϊ��"+l.get(i));
		}
		
		
		
		
		
	}

}
