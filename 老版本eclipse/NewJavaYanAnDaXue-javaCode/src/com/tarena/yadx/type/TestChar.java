package com.tarena.yadx.type;

public class TestChar {
	public static void main(String[] args) {
		/*
		 * 1.char����
		 *        -�ַ�������ʵ����һ��ʮ��λ�޷������������ֵ�Ƕ�Ӧ�ַ��ı���
		 *        -java�ַ����Ͳ��ñ��뷽ʽ����Unicode�ַ�������
		 *                      Unicode��������ͨ�õĶ����ַ��������е��ַ�����16λ
		 *        -�ַ�ֱ�������Բ����������еġ��С�����ʽ��Ҳ���Բ���16���Ƶı�ʾ��ʽ����'\u4e2d'              
		 *          
		 */
		char c1='��';
		char c2='\u4e2d';
		System.out.println(c1+"	"+c2);
		/*
		 * 2.��char�ͱ�����ֵ
		 *   -�ַ�ֱ����:'��'
		 *   -������ֱ����:0~65535֮�������	
		 *   -Uncode��ʽ��'\u0041',Unicode��16������ʽ
		 *    	
		 */
		char c3='A';
		char c4=65;
		char c5='\u0041';
		System.out.println(c3+" "+c4+" "+c5);//A A A
		/*
		 * 3.ʹ��ת���ַ�
		 * \n:�س���
		 * \r:���з�
		 * \\:��б��
		 * \':������
		 * \":˫����
		 */
		System.out.println("\"");
		
		
	}

	

}
