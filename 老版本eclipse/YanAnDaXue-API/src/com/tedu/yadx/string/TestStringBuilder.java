package com.tedu.yadx.string;
/**
 * StringBuilder��װ�ɱ��ַ���
 * @author 123
 *
 */

import java.awt.image.BufferedImage;

import org.junit.Test;
public class TestStringBuilder{
/*
	 * һ��StringBuilder��װ�ɱ��ַ���
	 *  1.StringBuilder���󴴽������ͨ�����÷����ı����װ���ַ�������
	 *  2.StringBuilder�����³��õĹ��췽��
	 *   public StingBuilder();
	 *   public StingBuilder(String str);
	 * ����StringBuilder���÷���
	 *  ���·����ķ���ֵ��ΪStringBuilder
	 *    -append(String str):׷���ַ���
	 *    -insert(int dstIffser,String s):�����ַ���
	 *    -delete(int start,int end):ɾ���ַ���
	 *    -replace(int start,int end,String str):�滻�ַ���
	 *    -reverse():�ַ�����ת
	 * ����StringBuilder
	 *  1.StringBuilder�ĺܶ෽���ķ���ֵ��ΪStringBuilder���ͣ���Щ�����ķ������Ϊ��return this��
	 *  2.���ڸı��װ���ַ����к��з����˸ö�������ã����԰������¼��ķ�ʽ��д���룺
	 *   buf.append("ibm")
	 *      .append("java")
	 *      .inser(3,oracle)
	 *      .replace(9,13,"JAVA")�� 
	 * �ġ�StringBuilder�ܽ�
	 *  1.StringBuilder�ǿɱ��ַ������ַ��������ݼ��㣬����ʹ��StringBuilder
	 *  2.java���ַ������ӹ���������StringBuilberʵ�ֵġ�
	 *    String s="AB";
	 *    String s1=s+"DE"+1;
	 *    String s1=new StringBuilber(s).appednd("DE").append(1).toString();
	 *  3.StringBuiber��StringBuffere                            �����ԣ�
	 *   -StringBuffere���̰߳�ȫ�ģ�ͬ��������������
	 *   -StringBuilber�Ƿ��̰߳�ȫ����������������Կ�
	 *             
	 */
	/*����StringBuilder��append����*/
	@Test
	public void testAppend(){//׷���ַ���
		StringBuilder buf=new StringBuilder("Programming Language");
		buf.append(":java").append(",php").append(",js").append("c#");
		System.out.println(buf);
		System.out.println(buf.toString());
	}
	/*����StringBuilder��insert����*/
	@Test
	public void testInsert(){//�����ַ���
		StringBuilder buf=new StringBuilder("Programming Language");
		buf.insert(11, "A");
		System.out.println(buf);
	}
	/*����StringBuilder��delete����*/
	@Test
	public void testDelete(){//ɾ���ַ���
		StringBuilder buf=new StringBuilder("Programming Language");
		buf.delete(18, 19);
		System.out.println(buf);
	}
	/*����StringBuilder��replace����*/
	@Test
	public void testReplace(){//�滻�ַ���
		StringBuilder buf=new StringBuilder("Programming Language");
		buf.replace(16, 19, "ccc");
		System.out.println(buf);
	}
	/*����StringBuilder��reverse����*/
	@Test
	public void testReverse(){//�ַ�����ת
		StringBuilder buf=new StringBuilder("Programming Language");
		buf.reverse();
		System.out.println(buf);
	}
	
}
