package day08;

import java.util.Arrays;

public class ���� {

	public static void main(String[] args) {
		/*
		
		 * 1.����Ķ���
		 * 
		 *
		int[] arr=new int[10];//������������arr����10��Ԫ�أ���ÿ��Ԫ�ض���int���ͣ�Ĭ��ֵΪ0
		*/
		/* 2.����ĳ�ʼ��
		 * 
		 *
		int[] arr=new int[3];//0,0,0
		int[] arr1={1,2,3,4};//1,2,3,4
		int[] arr2=new int[]{1,2,3,4};//1,2,3,4
		int[] arr3;
		arr3=new int[3];//0,0,0
*/
		/*
		 * ����ķ���
		 *
		int[] a=new int[3];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		System.out.println(a.length);//������鳤��
		System.out.println(a[a.length-1]);//���a���������һ�������ֵ
		
		
		//a[3]=400;		
		//System.out.println(a[3]);//������������±�Խ��
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
		 * 5.����ĸ���
		 */
	/*	int[] a={10,20,30,40,50};
		int[] a1=new int[6];
		
		
		
		
		System.arraycopy(a, 1, a1, 0, 4);
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
			
		}
	*/
		/*����ĸ���
		int[] a={10,20,30,40,50};
		//a:ԭ����
		//a1��Ŀ������
		//6��Ŀ������Ԫ�ظ���
		int[] a1=Arrays.copyOf(a, 4);
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		*/
		/*
		int[] a={10,20,30,40,50};
		//���������
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
		int[] a={1,5,2,8,3,4,7};//7��Ԫ��
		for(int i=0;i<a.length-1;i++){//��������
			for(int b=0;b<a.length-1-i;b++){//���ƴ���
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
