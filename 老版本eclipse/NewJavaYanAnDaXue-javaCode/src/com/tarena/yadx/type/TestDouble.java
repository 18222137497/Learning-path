package com.tarena.yadx.type;

import org.omg.Messaging.SyncScopeHelper;

public class TestDouble {
	public static void main(String[] args){
/*
 * 1.ʹ��double���и���������
 *       -����������С��������float��double
 *       -double�ľ�����float������
 *       -����ǳ���ʹ�õ���double����
 * 2.������ֱ������double����
 *       -����д����
 *           -ͨ��д����3.14��0.1
 *           -��ѧ��������1.25E2(1.25*10�Ķ��η�)��1.2e2
 *       -Ĭ�ϵĸ���ֱ����Ϊdouble�ͣ������Ҫ��ʾfloat���͵�ֱ��������Ҫ��F��f
 * 3.double����ʱ������������
 *       -2����ϵͳ���޷���ȷ�ı�ʾ1/10���ͺ���ʮ�������޷���ȷ�ı�ʾ1/3һ��
 *       -���ԣ�2���Ʊ�ʾ10���ƾͻ����һЩ����������һЩҪ�����ĳ��ϻᵼ�´����ȱ��                 
 */
	       double money=3.0;
	       double price=2.9;
	       System.out.println(money-price);
	       /*
	        * �����Ҫ��ȷ��������Կ��Ƿ���ʹ��double����float��������BigDecimal��ʵ��
	        */
}
}