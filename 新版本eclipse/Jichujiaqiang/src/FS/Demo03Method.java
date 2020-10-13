package FS;

import java.lang.reflect.Method;
/**
 * ��Ҫע����ǣ�������������
 * 		getMeThods�������صĹ�����Ա���������丸��Object���еĹ�������
 * 		��getDeclaredMethods()�����������ظ���Object���еķ���
 * @author 123
 *
 */
public class Demo03Method {
	public static void main(String[] args) throws Exception {
		Class<Person> c=Person.class;
		/*
		  ��ȡ���췽����
		  Method[] getMethods();//��ȡ���е����й�����Ա����������Method����
		  Method getMethod(String name,��<?>...parameterTypes);//��ȡָ�������Ĺ�����Ա����������Method����
		  Method[] getDeclaredMethods();//�������еĳ�Ա����������Method����
		  Method getDeclaredMethod(String name,��<?>...parameterTypes);//����ָ�������ĳ�Ա����������Method����
		*/
		Method[] methods = c.getDeclaredMethods();//��ȡ�������еĳ�Ա����������Method����    
		for (Method method : methods) {
			method.setAccessible(true);//��������
			System.out.println(method);
			System.out.println(method.getName());//��ó�Ա����������
		}
		System.out.println("--------------------");
		Person p = new Person();
		Method method = c.getMethod("add",int.class);//��ȡָ���Ĺ�����Ա����������Ϊ�������ͷ���������.class
		method.invoke(p, 1);//���ݲ�����ִ�з���,����Ǿ�̬����ǰ��Ĳ�������ֱ�Ӵ�null
		Object object;
	}
}
