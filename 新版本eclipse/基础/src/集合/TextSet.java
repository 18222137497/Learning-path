package ����;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * java.util.Set  extends Collection
 * 	�ص㣺
 * 		1.û����������������ͨforѭ������������ʹ��foreach����
 * 		2.������洢�ظ���Ԫ��
 * 	HashSet�ص㣺
 * 		1.��һ������ļ��ϣ�����Ԫ�غ�ȡ��Ԫ�ص�˳����ܲ�һ��
 * 		2.�ײ���һ����ϣ����ѯ���ٶȷǳ��죩
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
		for (Integer r : s) {//ʹ��foreach����
			System.out.println(r);
		}
	}
}
