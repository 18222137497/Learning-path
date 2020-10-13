package com.tedu.yadx.string;

import org.junit.Test;

public class TextString {
	/*
	 * һ��String�ǲ��ɱ���
	 *  1.java.long.Stringʹ����final���Σ����ܱ��̳�
	 *  2.�ַ����ײ��װ���ַ���������ַ�������в������㷨��
	 *  3.�ַ���һ��������������Զ�޷��ı䣬�������ÿ������¸�ֵ
	 *  4.java�ַ������ڴ��в���Unicode���뷽ʽ�������ַ���Ӧ�����ֽڵĶ�������
	 * ����String�����أ�������������
	 *  1.Ϊ����߳������ܣ���̬�ַ����ڳ���֮�д�����������ʹ��һ���������þ�̬�ַ���
	 *  2.�����ظ����ֵ��ַ���ֱ������JVM�������ڳ������в��ң���������򷵻ظö��� 
	 * �����ڴ���뼰����
	 *   String���ڴ��в���Unicode���룬ÿ���ַ�ռ�������ֽڣ��κ�һ���ַ����������Ļ���Ӣ�Ķ���һ���ַ������ֽ�
	 * �ġ�ʹ��indexOfʵ�ּ���
	 *  1.indexOf��������ʵ�����ַ����м�������һ���ַ���
	 *  2.String�ṩ�������ص�indexOf����
	 *  int indexOf(String str)-���ַ����м���str���������һ�γ��ֵ�λ�ã����û�м������򷵻�-1��
	 *  int indexOf(String str,int fromIndex)-���ַ�����fromIndexλ��  
	 *  3.String ��������lastIndexOf������
	 *   int lastIndexOf(String str,int from)-str���ַ����г��ֶ��ʱ���������һ�����ֵ�λ��
	 * �塢charAt
	 *  1.String�ж�����charAt������
	 *  char charAt(int index)-�÷������ڷ����ַ���ָ��λ�õ��ַ�������index��ʾָ����λ��
	 *  
	 */
	/*���Գ���ֵ*/
	@Test
	public void testConstantPool(){
		String str1="hello";//���ڳ���ֵ��
		//���ᴴ���µ�String���󣬶���ʹ�ó���ֵ�еĶ���
		String str2="hello";
		System.out.println(str1==str2);
		//ʹ��new�ؼ��ֻᴴ����String����
		String str3=new String("hello");
		System.out.println(str1==str3);
	}
	/*����String����ĳ���*/
	@Test
	public void testLength(){
		String str1="hello";
		System.out.println(str1.length());
		String str2="��ã�String";
		System.out.println(str2.length());
		
	}
	/*��һ���ַ����м�����һ���ַ���*/
	@Test
	public void testIndexOf(){
		String str="i can because i think i can";
		int index=str.indexOf("can");
		System.out.println(index);
		index=str.indexOf("can",6);
		System.out.println(index);
		index=str.indexOf("Can");
		System.out.println(index);//����-1
	}
	/*ʹ��subString��ȡ�Ӵ�*/
	@Test
	public void testSubString(){
		String str="http://www.oracle.com";
		String subStr=str.substring(11,17);//ǰ���󲻰�
		subStr=str.substring(7);//www.oracle.com
	}
	/*trim*/
	@Test
	public void testTrim(){//trimȥ�������ַ������˵Ŀո񣬲�ȡ���м�Ŀո񣡣�����
		String userName=" good man ";
		userName=userName.trim();
		System.out.println(userName.length());//8
		System.out.println(userName);//good man
	}
	/*charAt*/
	@Test
	public void testCharAt(){
		String str="whatisjava";
		char c=str.charAt(3);
		System.out.println(3);
		//������ǰ�ַ���str��ӡÿһ���ַ�
		for (int i = 0; i < str.length(); i++) {
			char b=str.charAt(i);
			System.out.print(b);
		
		}
	}
	/*startsWith&&endsWith*/
	@Test
	public void testStartsWithAndEndsWith(){
		String str="Thinking in java";
		System.out.println(str.endsWith("java"));//����boolean����true
		System.out.println(str.startsWith("T"));//true
		System.out.println(str.startsWith("thinking"));//false
	}
	/*��Сд�仯*/
	@Test
	public void tasrToUpperCaseAndToLowerCase(){
		String str="��ϲ��java";
		str=str.toUpperCase();
		System.out.println(str);
		str=str.toLowerCase();
		System.out.println(str);
	}
	/*����������ת��Ϊ�ַ�������*/
	@Test
	public void testValueOf(){
		double pi=3.1415926535;
		int value=123;
		boolean flag=true;
		char[] charArr={'a','b','c','d','e','f','g'};
		String str=String.valueOf(pi);
		System.out.println(str);
		str=String.valueOf(value);
		System.out.println(str);
		str=String.valueOf(flag);
		System.out.println(str);
		str=String.valueOf(charArr);
		System.out.println(str);
		
	}
}
