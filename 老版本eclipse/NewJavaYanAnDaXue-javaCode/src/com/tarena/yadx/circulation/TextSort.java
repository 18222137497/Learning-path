package com.tarena.yadx.circulation;

import java.util.Arrays;

public class TextSort {
	public static void main(String[] args){
		/*
		 * һ�����������
		 *  1.�����Ƕ�����ʩ�ӳ��õķ���
		 *  2.��ν������ָ������Ԫ�ذ��մ�С�����Ӵ�С��˳����������
		 *  3.����Ԫ�ؽ϶�����飬������㷨������������Ҫ
		 *  4.һ������£�ͨ�����������Ԫ�صĽ������������������㷨������
		 *  5.���е������㷨����������ð�����򣬿��ŵ�
		 * �������顰����ð�ݡ���������                    �����ѭ�������������ڲ�ѭ������������
		 *  1.ð������ԭ�򣺱Ƚ����ڵ�Ԫ�أ������Υ������˳��׼���򽻻�
		 *  2.���Լ���⣺
		 *    -��һ���ҵ�������Ԫ�����ķ������һ��λ�ã����ڱ䶯��
		 *    -�ڶ����ҵ�ʣ��Ԫ�ص����ֵ���ڵ����ڶ���λ���ϣ������ڱ䶯��
		 *    -�Դ����ƣ�ֱ�����
		 *  3.�Ƚ�ʱ���Բ��á��³����ķ�����Ҳ����ʹ�á��ϸ����ķ���ʵ��  
		 *  4.JDK�ṩ��Arrays.sort(arr)������װ����������㷨   System.out.print(Arrays.toString(arr))
		 */
		int[] arr={89,50,84,57,61,20,86};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int b=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=b;
				}			
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"	");
		}
		
//		int[] arrs={20,89,50,84,57,61,86};
//		Arrays.sort(arrs);
//		System.out.println(Arrays.toString(arrs));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
