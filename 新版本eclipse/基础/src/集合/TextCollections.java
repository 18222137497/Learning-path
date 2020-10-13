package ����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collections������
 * 	addAll(Collection<T> a,T...elements)�����������һЩԪ��
 * 	shuffle(List<?> list)���Ҽ���˳��
 * 	sort(List<?> list)�����ϰ���Ĭ�ϵĹ�������Ĭ��Ϊ��������
 * 		�Զ������������Ҫʵ��Comparable�ӿڣ���дcompareTo����
 * 	sort(List<?> list,Collection<? super T>)�����ϰ���ָ���Ĺ�������
 * 		Comparator��Comparable������
 * 			Comparator���൱����һ�����������бȽ�����
 * 			Comparable���Լ��ͱ��˱Ƚϣ��Լ���Ҫʵ��Comparable�ӿڣ���д�ȽϵĹ���compareTo����
 * @author 123
 *
 */
public class TextCollections {
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
//		l.add("a");
//		l.add("b");
//		l.add("c");
//		l.add("d");
//		l.add("e");
//		l.add("f");
		Collections.addAll(l, "a","b","c","d","e","f");//�ȼ����������
		System.out.println(l);
		Collections.shuffle(l);//���Ҽ���˳��
		System.out.println(l);
		ArrayList<Integer> m=new ArrayList<>();
		Collections.addAll(m, 1,2,3,4,6,8,9,6,4,3);
		System.out.println(m);
		Collections.sort(m);//�����ϰ���Ĭ�ϵĹ���˳���������򣩣�ֻ�ܴ�List���ϣ����ܴ�set����
		System.out.println(m);
		Person1 p=new Person1("����",18);
		Person1 p1=new Person1("����1",17);
		Person1 p2=new Person1("b����2",21);
		Person1 p3=new Person1("a����2",21);
		ArrayList<Person1> pp=new ArrayList<Person1>();
		Collections.addAll(pp, p,p1,p2,p3);
		System.out.println(pp);
		Collections.sort(pp);//����
		System.out.println(pp);
		Collections.sort(pp, new Comparator<Person1>() {
			@Override
			public int compare(Person1 o1, Person1 o2) {
				int aaa= o1.getAge()-o2.getAge();
				if (aaa==0) {
					aaa=o1.getName().charAt(0)-o2.getName().charAt(0);//�Ƚ����ֵ�һ���ַ�
				}
				return aaa;
			}
		});
		System.out.println(pp);
		
	}

}
