package FS;
/**
 * ͬһ���ֽ����ļ�*.class��һ�γ������й����У�ֻ�ᱻ����һ�Σ����������ַ�����ȡ��class������ͬһ��
 * @author 123
 *
 */
public class ��ȡ�ֽ���Class��������ַ��� {
	public static void main(String[] args) {
		/*1.Class.forName("ȫ����"):���ֽ����ļ����ؽ��ڴ棬����Class����*/
			/*�����������ļ��������������������ļ��У���ȡ�ļ���������*/
		try {
			System.out.println(Class.forName("����.Person"));//class ����.Person
		} catch (ClassNotFoundException e) {//���Ҳ����쳣
			e.printStackTrace();
		}
		/*2.����.class:ͨ������������class��ȡ*/
			/*�����ڲ�������*/
		System.out.println(Person.class);//class ����.Person
		/*3.����.getClass();:getClass()������Object���ж�����*/
			/*�����ڶ���Ļ�ȡ�ֽ���ķ�ʽ*/
		Person p=new Person();
		System.out.println(p.getClass());//class ����.Person
	}
}
