package com.tedu.yadx.object;

import org.junit.Test;

/**
 * Object��
 * @author 123
 *
 */

public class TestObject {
	/*
	 * һ��Object
	 *  1.��java��̳��У�java.long.Object��λ�ڶ���     long�����õ�����������
	 *  2.�������һ��java��ʱû��ʹ��extends�ؼ��������丸�࣬������Ĭ�ϵĸ���ΪObject
	 *  3.Objcet���͵�Ӧ�ñ�������ָ�������
	 * ����toString����
	 *  1.Object�е���Ҫ�������ڷ��ض���ֵ���ַ������ַ�ʽ
	 *  2.ԭ���Ͻ�����д����ʽ�����Ϊ��"�������[��ֵ]"
	 *  3.�����дtoSring����
	 *   - java�����кܶ�ط�Ĭ�ϵ��ö����toString������
	 *    �ַ���+�����Զ����ö����toString������
	 *    System.out.print(�������)���ֽڵ���toString������
	 *   - �������дtoString��������ʹ��object��toString���������߼�Ϊ��
	 *    ����@ɢ����
	 *  4.toString�����Ƿǳ����õĵ��Թ��ߡ�
	 *  5.jdk�еı�׼��⣬����඼������toString�����������û���ȡ�йض���״̬�ı�Ҫ��Ϣ
	 *  6.ǿ�ҽ���Ϊ�Զ����ÿһ���඼����toString���� 
	 *  7.String���toString�������Ƿ�������
	 * ����equals���� 
	 *  1.Object�еķ����������ڼ��һ�������Ƿ������һ������
	 *  2.��Object����������ж����������Ƿ������ͬ�����ü��Ƿ�Ϊ��ͬ�Ķ���
	 *  3.��ʵ��Ӧ�ã�һ����Ҫ��д�÷�����ͨ���Ƚ϶���ĳ�Ա����ʹ�÷�������������
	 *  4.String��дequals����
	 * 	String��equals�������ڱȽ������ַ���������ַ������Ƿ����
	 * �ġ�equals��==���������ԣ�
	 *  1.==���ڱȽ�����������ֵ�����������κ����ͣ�����������ͱȽϵ����������ñ�����ִ洢��ֵ����ַ��Ϣ�����ж����������Ƿ���ָ��
	 *  2.equals��object�ķ�������д�Ժ���ԱȽ���������������Ƿ����
	 *  3.��Ҫע����ǣ��������дequals����==������ͬ�ıȽϹ���
	 */
	/*�����ַ����ıȽ�*/
	@Test
	public void Demo(){
		String s1=new String("abc");
		String s2=new String("abc");
		String s3=new String("A");
		System.out.println(s1.equals(s2));//�Ƚ��ַ��Ƿ����
		System.out.println(s2.equals(s3));
		
	}
}
