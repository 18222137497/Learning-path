package com.tarena.yadx.brench;

import java.lang.invoke.SwitchPoint;

public class TestIf {
	public static void main(String[] args) {
		
	
     /*
      * 1.�κθ��ӵĳ����߼�������ͨ����˳�򡱣�����֧������ѭ�������ֻ����ĳ���ṹʵ��
      * 2.ʲô�Ƿ�֧�ṹ
      *   -����������ʱִ��ĳЩ���if
      *   -������������ʵִ����һЩ���if else
      * 3.if(�߼����ʽ){
      *      ���һ��
      *      ������
      *      }
      *      .���߼����ʽΪtrue����ִ�д�����
      *      .��Ϊflase����ִ�� 
      *   ��if������ֻ��һ�����ʱ{}����ʡ��
      *   �����������뷢�����ʱ�����ײ���������˼���ifֻ��һ�����ҲҪ��{}��
      * 4.switch case���ִ���߼�
      *   1.switch case�����һ������ķ�֧�ṹ�����Ը���һ���������ʽ�Ĳ�ͬȡֵ���Ӳ�ͬ����ڿ�ʼִ��
      *   2.ͨ��case1,case2����casen��Ӧ��ȫ��ͬ�Ĳ��������Ժ�break�����ϲ�����ִ������Ӧ�����Ƴ�
      *     switch�飬��ִ�к������ 
      * 5.swiitch case����
      *    .switch case������dreak�����ʹ��ʵ�ַ�֧���ܡ�
      *    .switch caseʵ�ַ�֧����ʱ��if else����Ҫ��������switch case�ṹ����Ч�ʸ�    
      *    .��jdk7.0��ʼswitch֧���ַ������ʽ  
      */
	int num=3;
	switch(num){
	case 1:
		System.out.println("1.....");
		break;
	case 2:
		System.out.println("2.....");
		break;
	case 3:
		System.out.println("3.....");
		break;
		
	}
	}
	
}
