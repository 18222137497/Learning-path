package ����;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap�����Զ������͵ļ�ֵ
 *  Map���ϱ�֤key��Ψһ�ģ�
 *  	��Ϊkey��Ԫ�أ�������дHashCode��equals�������Ա�֤key��Ψһ��
 * @author 123
 *
 */
public class TextHashMap {
	public static void main(String[] args) {
		HashMap<Person1,String> m=new HashMap<Person1, String>();
		m.put(new Person1("Ů��", 18), "Ӣ��");
		m.put(new Person1("����", 20), "����");
		m.put(new Person1("��ͳ", 30), "����");
		m.put(new Person1("Ů��", 18), "����");
		Set<Map.Entry<Person1,String>> s=m.entrySet();
		Iterator<Map.Entry<Person1, String>> i=s.iterator();
		for(Map.Entry<Person1,String> entry:s) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
