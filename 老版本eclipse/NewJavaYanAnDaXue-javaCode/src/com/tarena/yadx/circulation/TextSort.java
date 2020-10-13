package com.tarena.yadx.circulation;

import java.util.Arrays;

public class TextSort {
	public static void main(String[] args){
		/*
		 * 一，数组的排序
		 *  1.排序是对数组施加常用的方法
		 *  2.所谓排序，是指将数组元素按照从小到大或从大到小的顺序重新排列
		 *  3.对于元素较多的数组，排序的算法的优劣至关重要
		 *  4.一般情况下，通过排序过程中元素的交换次数来衡量排序算法的优劣
		 *  5.常有的排序算法：插入排序，冒泡排序，快排等
		 * 二，数组“““冒泡”””排序法                    “外层循环控制行数，内层循环控制列数”
		 *  1.冒泡排序原则：比较相邻的元素，如果有违反最后的顺序准则，则交换
		 *  2.可以简化理解：
		 *    -第一次找到的所有元素最大的放在最后一个位置，不在变动；
		 *    -第二次找到剩余元素的最大值放在倒数第二个位置上，不许在变动；
		 *    -以此类推，直到完成
		 *  3.比较时可以采用“下沉”的方法，也可以使用“上浮”的方法实现  
		 *  4.JDK提供了Arrays.sort(arr)方法封装数组的排序算法   System.out.print(Arrays.toString(arr))
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
