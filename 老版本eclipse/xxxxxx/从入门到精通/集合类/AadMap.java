package ������;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map�ӿ� Map����
 *  TreeMap  ��  HashMap
 *  һ�㶼��HashMap��TreeMap������һ�����㣬������̫��
 * @author 123
 *
 */
public class AadMap {
	public static void main(String[] args) {
	Map map=new HashMap();
	map.put("��", "ǿ��");//put(key,value)�ɴ�������ʽ
	map.put(1, 23);
	map.put(new Object(), new Object());
	System.out.println("map�м���Ԫ�أ�"+map.size());
	Set set=map.keySet();//��map�����е�key���ϴ��뼯����
	Iterator it=set.iterator();//map������û�е�������
	while(it.hasNext()){
		Object obj=it.next();//���ѭ����ֻ�ܷ�һ��it.next()���������ֵ���Խ���쳣
		System.out.println("��="+obj+"	��ֵ="+map.get(obj));
		
	}
	
}
}
