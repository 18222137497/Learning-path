package com.tarena.yadx.type;

public class TestLong {
	public static void main(String[] args){
		
	
/*
 * �ڱ�ʾ����ʱ�����int���͵ķ�Χ����������ʹ��long�ͣ�һ��long�͵ı���ռ��8���ֽڣ�64λ��
 *                                           ����ʾ��Χ��-2^63~2^63-1
 * 2.���Ҫ��ʾlong��ֱ��������Ҫ��L����l��β
 *    ע�⣺���ֱ��������int��Χ��ֱ������û��l����������  
 * 3.ͨ��ʱ��ĺ����� ���洢���ں�ʱ��
 *    JDK�ṩ��System.currentTimeMillis()���������ص���1970��1��1��0�㵽��ʱ�˿��������ĺ�����
 *    ����������λlong���÷��������ڼ�ʱ����                                              
 */
		long time=System.currentTimeMillis();		
		long a=100051561651l;
		long b=9841215215355l;
		int c=(int)(a*b/a*5315/100);
		System.out.println("	");
		long times=System.currentTimeMillis();
		System.out.println(times-time+"����");//1000����=1��
		
		
		
		
		
		
		
		
		
		
}
}