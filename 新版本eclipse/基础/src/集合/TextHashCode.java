package ����;
/**
 * ��ϣֵ����һ��ʮ������������ϵͳ�������(���Ƕ���ĵ�ֵַ����һ���߼���ַ����ģ������ĵ�ַ����������ʵ�ʴ���������ַ)
 * 	��Object������һ���������Ի�ȡ����Ĺ�ϣֵ
 * 	public native int hashCode();//���ش˶���ù�ϣֵ
 * 	native:����÷������õ��Ǳ��ز���ϵͳ�ķ���
 * @author 123
 *
 */
public class TextHashCode {
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		System.out.println(p1.hashCode());//804564176
		System.out.println(p2.hashCode());//1421795058
		System.out.println(p3.hashCode());//1555009629
		/*
		 * toString ��Դ�룺
		 * 		public String toString() {
		 * 		return getClass().getName() + "@" + Integer.toHexString(hashCode());}
		 */
		System.out.println(p1);//����.Person@2ff4acd0
		System.out.println(p2);//����.Person@54bedef2
		/*
		 * String��hashCode��������д��
		 */
		String s1=new String("abc");
		String s2=new String("abc");
		System.out.println(s1.hashCode());//1179395
		System.out.println(s2.hashCode());//1179395
		
		/*�����⣡*/
		System.out.println("�ص�".hashCode());//1179395
		System.out.println("ͨ��".hashCode());//1179395
	}
}
class Person{
	
}