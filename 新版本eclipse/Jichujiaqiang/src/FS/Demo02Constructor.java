package FS;

import java.lang.reflect.Constructor;

public class Demo02Constructor {
	public static void main(String[] args) throws Exception {
		Class<Person> c=Person.class;
	/*
	  ��ȡ���췽����
	  Constructor<?>[] getConstructors();//��ȡ���е����й������췽��������Constructor����
	  Constructor<T> getConstructor(��<?>...parameterTypes);//��ȡָ�������Ĺ������췽��������Constructor����
	  Constructor<?>[] getDeclaredConstructors();//�������еĹ��췽��������Constructor����
	  Constructor<T> getDeclaredConstructor(��<?>...parameterTypes);//����ָ�������Ĺ��췽��������Constructor����
	*/
		Constructor<Person> c1 = c.getConstructor(String.class,int.class);//��ȡ���е����й������췽��
		System.out.println(c1);//public ����.Person(java.lang.String,int)
		System.out.println("-------------------");
		/*Constructor.newInstance(����Ϊconstructor����Ĳ����б�) */
		Person person = c1.newInstance("���Լ�",21);//���ù��췽������Person����
		System.out.println(person);
		System.out.println("-------------------");
		//Person newInstance = c.newInstance();//�����޲ι��췽���Ĺ��ڷ���
		Person p = c.getDeclaredConstructor().newInstance();//�����޲ι��췽������һ��object���Ͷ���
		System.out.println(p);
		//c1.setAccessible(true);//��������
	}
}
