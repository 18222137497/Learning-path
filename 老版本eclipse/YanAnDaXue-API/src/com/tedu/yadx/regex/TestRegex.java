 package com.tedu.yadx.regex;

import java.util.Arrays;

import org.junit.Test;

/**
 * ������ʽ
 * @author 123
 *
 */
public class TestRegex {
	/*
	 * 1��ʵ�ʿ����о�����Ҫ���ַ������ݽ���һЩ���ӵ�ƥ�䣬���ң��滻�Ȳ�����ͨ��������ʽ����ʵ���ַ����ĸ��Ӳ���
	 * 2��������ʽ��һ���ض��ַ����һ���������ַ������������ı�����Ĺ��ߣ�������ʽ���Ǽ�¼�ı�����Ĵ���
	 * 3.���磺
	 *  -������ʽ��"[a-z]"��ʾa��z�������ַ�
	 *  -������ʽ��"[a-z]+"��ʾ��һ������a��z��ɵ��ַ���
	 * 4.������ʽ                            ˵������
	 *    [abc]                            abc������һ���ַ�
	 *    [^abc]                           ����abc������һ���ַ�
	 *    [a-z]                            a,b.....z������һ���ַ�
	 *    [z-zA-Z0-9]                      a~z��A~Z��0~9������һ���ַ�
	 *    [a-z&&[^bc]]                     a-z�г���bc֮�������һ���ַ�
	 *    .                                ����һ���ַ�
	 *    \d                               ����һ�������ַ�=[0-9]
	 *    \w                               ����һ�������ַ�=[a-zA-Z0-9_]
	 *    \s                               �հ��ַ�
	 *    \W                               �ǵ����ַ�
	 *    \D                               �������ַ�
	 *    \S                               �ǿհ��ַ�
	 *    x?                               ��ʾ0����1��x(x��ʾ����������ʽ)
	 *    x*                               ��ʾ0����������x
	 *    x+                               ��ʾ1������x
	 *    x{n}							   ��ʾn��x
	 *    x{n,}                            ��ʾn����������x
	 *    x{n,m}                           ��ʾn����m��x
	 * 5.���顰()��
	 *    ���飺()��ʾ���飬���Խ�һϵ��������ʽ����һ�����壬����ʱ����ʹ�á�|����ʾ���ϵ
	 * 6.�߽�ƥ��
	 *    "^"��������ڵ�һ��λ�ñ�ʾ�ַ�����ʼ
	 *    "$"������������һ��λ�ñ�ʾ�ַ�������
	 * ����matches����
	 *    ��һ���ַ�����������ʽƥ�䣬�ɹ�true ��֮false
	 * ����split��������Ҫ����
	 *    String���split���������Խ��ַ�������ָ���ķָ����ֳ��ַ������� 
	 *    String[] split(String regex)-����Ϊ������ʽ����������ʽΪ�ָ�������ַ����ָ�Ϊ�ַ�������     
	 *  ��ϰ��
	 *    1.��"Are you kidding me ?"�ַ����ո�ɾ�� 
	 *    2.��100+200-150=150ʽ��������ȫ��ȡ������ӡ     
	 * �ġ�replaceAll����
	 *   String���ṩ�������ַ������滻
	 *    String replaceAll��String regex String replacement��
	 *    ���ַ�����ƥ��������ʽregex�ַ������滻replacement   
	 */
	//����������ʽ���ַ�����
	@Test
	public void testRegex3(){
		String regex1="[a-z]";
		String regex2="[^a-z]";
		String regex3="[a-z&&[^bc]]";
		String regex4="\\d";
		String regex5="\\D";
		String regex6="\\s";
		String regex7="\\S";
		String regex8="\\w";
		String regex9="\\W";

	}
	/*����������ʽ��"*","?","+"......*/
	public void textRegex1(){
		String regex1="[a-z]*";
		String regex2="\\w+\\.jar";
		String regex3="\\d?[a-z]*";
		System.out.println("abcde".matches(regex1));//.matches���ж��Ƿ��ڷ�Χ��
		
	}
	/*����������ʽ:{n}{n,}{n,m}*/
	@Test
	public void testRegex2(){
		String regex1="\\w{5}";
		String regex2="\\d{5,}";
		String regex3="[a-zA-Z]{5,8}";
	}
	/*��splitȥ�ո�*/
	@Test
	public void liaxi(){
		String a="Are you kidding me ?";
		String[] a1=a.split(" ");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	}
	/*��100+200-150=150�е�����ȫ��ȡ������ӡ*/
	@Test
	public void lianxi(){
	String a="100+200-150=150";
	String b="(\\W)";
	String[] a1=a.split(b);
    System.out.println(Arrays.toString(a1));

	}
	/*
	 * ʹ��replaceAll����ʵ���ַ������滻
	 */
	@Test
	public void testReplaceAll(){
		//��str�����е������滻Ϊ�����֡�����
		String str="abc123bcd45ef6g7890";
		str=str.replaceAll("\\d+", "����"); 
		System.out.println(str);
		
		
		
		
		
		
		
	}
}
