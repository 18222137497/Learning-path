package ����;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map���ϵı�����ͨ������ֵ�ķ�ʽ
 * Map�����еķ�����
 * 	Set<> keySet(),���ش�ӳ���а����ļ���Set��ͼ
 * 	ʵ�ֲ��裺
 * 		1.ʹ��Map�����еķ���keySet()����Map�����е�keyȡ�������洢��һ��Set������
 * 		2.����set���ϣ���ȡMap�����е�ÿһ��key
 * 		3.ͨ��Map�����еķ���get(key)��ͨ��key��value
 * @author 123
 *
 */
public class TextkeySet {
	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String, String>();
		m.put("����", "��������");
		m.put("����1", "��������1");
		m.put("����2", "��������2");
		m.put("����3", "��������3");
		Set<String> s=m.keySet();
		Iterator<String> i=s.iterator();
		while (i.hasNext()) {
			String ss=i.next();
			System.out.println(ss+" "+m.get(ss));
		}
		System.out.println("-------------------------------------");
		for(String sss:m.keySet()) {
			System.out.println(sss+" "+m.get(sss));
		}
		
	}
}
