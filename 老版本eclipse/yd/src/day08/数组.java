package day08;

import java.util.Arrays;

public class 数组 {

	public static void main(String[] args) {
		/*
		
		 * 1.数组的定义
		 * 
		 *
		int[] arr=new int[10];//生命整形数组arr包含10个元素，且每个元素都是int类型，默认值为0
		*/
		/* 2.数组的初始化
		 * 
		 *
		int[] arr=new int[3];//0,0,0
		int[] arr1={1,2,3,4};//1,2,3,4
		int[] arr2=new int[]{1,2,3,4};//1,2,3,4
		int[] arr3;
		arr3=new int[3];//0,0,0
*/
		/*
		 * 数组的访问
		 *
		int[] a=new int[3];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		System.out.println(a.length);//输出数组长度
		System.out.println(a[a.length-1]);//输出a数组上最后一个数组的值
		
		
		//a[3]=400;		
		//System.out.println(a[3]);//编译错误，数组下标越界
		*/
		/*
		 * 
		 *
		int[] a=new int[10];
		for(int i=0;i<a.length;i++){
			a[i]=(int) (Math.random()*10);
			System.out.println(a[i]);
		}
		*/
		/*
		 * 5.数组的复制
		 */
	/*	int[] a={10,20,30,40,50};
		int[] a1=new int[6];
		
		
		
		
		System.arraycopy(a, 1, a1, 0, 4);
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
			
		}
	*/
		/*数组的复制
		int[] a={10,20,30,40,50};
		//a:原数组
		//a1：目标数组
		//6：目标数组元素个数
		int[] a1=Arrays.copyOf(a, 4);
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		*/
		/*
		int[] a={10,20,30,40,50};
		//数组的扩容
		a=Arrays.copyOf(a, a.length+1);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		*/
		/*
		int[] b={1,2,3,4,5};
		int[] c={9,8,7,6,5};
		System.arraycopy(b, 1, c, 0, 2);
		for(int i=0;i<b.length;i++){
			System.out.println(c[i]);
			
		}
		int[] a={1,2,3,4,5};
		a=Arrays.copyOf(a, a.length+2);
		for(int x=0;x<a.length;x++){
			System.out.println(a[x]);
			
		}
	*/
	/*	int[] a1={8,9,10,11,12,13,14,15,16};
		int[] a={1,2,3,4,5,6,7,8,9};
		System.arraycopy(a1, 1, a, 0, 2);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
		}
		System.out.println();
		int[] b={1,2,3,4,5};
		int[] c=Arrays.copyOf(b, 4);
		for(int x=0;x<c.length;x++){
			System.out.print(c[x]);
			
		}
		System.out.println();
		int[] d=new int[5];
		d=Arrays.copyOf(d, d.length+1);
		for(int y=0;y<d.length;y++){
			System.out.print(d[y]);
			
		}
		*/
//		int[] a={2,6,9,5,8};
//				Arrays.sort(a);		
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
		int[] a={1,5,2,8,3,4,7};//7个元素
		for(int i=0;i<a.length-1;i++){//控制轮数
			for(int b=0;b<a.length-1-i;b++){//控制次数
				if(a[b]<a[b+1]){
					int t=a[b];
					a[b]=a[b+1];
					a[b+1]=t;
				}									
			}						
		}
		for(int x=0;x<a.length;x++){
			System.out.println(a[x]);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
