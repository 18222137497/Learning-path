package 自己做的小程序;

import java.util.Scanner;

public class 生成指定长度范围的数组 {
	
	public static void generateArray(int length,int range){
		int[] arr=new int[length];//10
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int)(Math.random()*range);//100
			 
		}
		
		
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("输入个数：");
		int length=scan.nextInt();//10
		System.out.println("输入范围：");
		int range=scan.nextInt();//100
	     生成指定长度范围的数组.generateArray(length, range);//10  100
	}

}
