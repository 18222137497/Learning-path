package Stream��;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

/*
 * static <T> Stream<T> of(T... values) ������Ԫ����ָ��ֵ��˳�������� 
 * Collection<T>��������.stream������
 * Map<T,T>������û��.stream��������Ҫ��ӵ���
 */

public class ��ȡStream�������ַ�ʽ {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		Stream<String> s1=a.stream();
		
		Set<String> s=new HashSet<String>();
		Stream<String> s2=s.stream();
		
		Collection<String> c=new ArrayList<String>();
		Stream<String> s3=c.stream();
		
		Map<String, String> m=new HashMap<String, String>();
		Set<String> kets=m.keySet();//��ȡ�����б�
		Stream<String> s4=kets.stream();
		Collection<String> c1=m.values();//��ȡֵ���б�
		Stream<String> s5=c1.stream();
		Set<Entry<String, String>> ss = m.entrySet();//ע������
		Stream<Entry<String, String>> s6=ss.stream();//ע�ⷺ��
	}
}
