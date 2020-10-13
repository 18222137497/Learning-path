package FS;

import java.lang.reflect.Field;

public class Dmeo01Field {
	public static void main(String[] args) throws Exception  {
		Class<Person> c=Person.class;
		/*
		  ��ȡ��Ա������
		  Field[] getFields();//��ȡ���е����й�����Ա����������Field����
		  Field getField(String name);//��ȡָ���Ĺ�����Ա����������Field����
		  Field[] getDeclaredFields();//�������еĳ�Ա����������Field����
		  Field getDeclaredField(String name);//����ָ���ĳ�Ա����������Field����
		 */
		Field[] f=c.getFields();//��ȡ���е����й�����Ա����������Field����
		for (Field field : f) {
			System.out.println(field);//public int ����.Person.age   ��һ�������ĳ�Ա����
		}
		System.out.println("------------------------");
			Field f1 = c.getField("age");//��ȡָ���Ĺ�����Ա����������Field���� ,������Ҫ���������쳣
			System.out.println(f1);
			Person p=new Person();
			/*Object Field.get(Object object)*/
			Object object = f1.get(p);//��ȡage������ֵ������object����
			/*������Ҫ����һ��objectֵ����������Ա������static���εĿ���ֱ�Ӵ�null��������ֱ�ӷ��ظ�Field����ĳ�Ա����ֵ������*/
			System.out.println(object);//0
			System.out.println("------------------------");
		Field[] ff=c.getDeclaredFields();//�������еĳ�Ա����������Field����
		for (Field field : ff) {
			System.out.println(field);//private java.lang.String ����.Person.name
			                          //public static int ����.Person.age
		}
		Field f2 = c.getDeclaredField("name");
		System.out.println(f2);
		System.out.println("------------------------");
		/*���ó�Ա������ֵ*/
		/*��һ������Ϊ���󣬵ڶ��������ó�Ա������ֵ,��������Ա������static���εĿ���ֱ�Ӵ�null��������ֱ�ӷ��ظ�Field����ĳ�Ա����ֵ������*/
		f1.set(null, 1);
		System.out.println(p);//Person [name=null, age=1]
		f2.setAccessible(true);//���Է���Ȩ�����η��İ�ȫ���               �������䣡��������
		f2.set(p, "���Լ�");
		System.out.println(p);//Person [name=���Լ�, age=1]
	}
}
