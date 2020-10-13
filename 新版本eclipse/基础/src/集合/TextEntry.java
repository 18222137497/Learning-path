package ����;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map���ϱ����ĵڶ��ַ�����ʹ��entry�������
 * 
 * Map�����еķ�����
 * 	Set<Map.Entry<K,V>> entrySet()�Żش�ӳ���а�����ӳ���ϵ��set��ͼ��
 * 
 * ʵ�ֲ��裺
 * 		1.ʹ��Map�����еķ���entrySet(),��Map�����ж��Entry����ȡ�������洢��һ��Set������
 * 		2.����Set���ϣ���ȡÿһ��Entry����
 * 		3.ʹ��Entry�����еķ���getKey()��getValue()��ȡ����ֵ
 * @author 123
 *
 */
public class TextEntry {
	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String, String>();
		m.put("����","��������");
		m.put("����1","��������1");
		m.put("����2","��������2");
		m.put("����3","��������3");
		Set<Map.Entry<String, String>> s=m.entrySet();
		Iterator<Map.Entry<String,String>> i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<String, String> e=i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("---------------------------");
		for (Map.Entry<String, String> entry : s) {
			String z=entry.getKey();
			String x=entry.getValue();
			System.out.println(z+" "+x);
		}
		
	}
}
