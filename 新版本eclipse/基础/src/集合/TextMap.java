package ����;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map<K,V>����
 * java.util.HashMap<K,V>���� implements Map<K,V>
 * HashMap<K,V>���ϵ��ص㣺
 * 		1.�ײ��ǹ�ϣ����ѯ��
 * 			jdk1.8֮����  ���飫��������
 * 			jdk1.8֮����  ���飫��������/�����(����ĳ��ȳ���8)����߲�ѯ�ٶ�
 * 		2.��һ������ļ��ϣ�����Ԫ����ȡ��Ԫ�ص�˳����ܲ�һ��
 * java.util.LinkedHashMap<K,V>���� extends HashMap<K,V>
 * LinkedHashMap<K,V>���ص�
 *      1.�ײ��ǹ�ϣ������(��֤������˳��)
 *      2.������һ������ļ��ϣ��洢��ȡ����˳��һ��
 * @author 123
 *
 */
public class TextMap {
	public static void main(String[] args) {
		show1();
	}
	/*public V put(K k,V v);��ָ���ļ���ֵ��ӵ�Map������
	 	����ֵ��v
	 		�洢��ֵ�Ե�ʱ��key���ظ����᷵��null
	 		�����ֵ�Ե�ʱ��key�ظ�����ʹ���µ�value�滻map�е�value�������滻��value
	 		*/
	/*public V remove(K k,V v);ɾ��ָ������Ԫ��
	  	����ֵ��v
	  		ɾ���ɹ�����ɾ���ļ���Ӧ��ֵ
	  		ɾ��ʧ�ܷ���null
	 */
	/*public V get(K k);����ָ���ļ�����ö�Ӧ��ֵ
	 	����ֵ��v
	 		���򷵻�ָ������Ӧ��ֵ
	 		û�з���null
	 */
	/*public boolean containsKey(K k);�жϼ������Ƿ����ָ���ļ�
	 	����ֵ��boolean
	 		�з���true��
	 		�޷���false��
     */
	public static void show1() {
		Map<String,String> m=new HashMap<>();
		String v1=m.put("�", "������1");
		System.out.println("v1	"+v1);
		
		String v2=m.put("�", "������2");
		System.out.println("v2	"+v2);
		
		System.out.println(m);//{�=������2}    ��д��toString����
		
		boolean b=m.containsKey("�");
		System.out.println(b);//true
		System.out.println(m);//{�=������2} 
	}
}
