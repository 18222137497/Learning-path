package work;

import java.util.Arrays;

public class HelloWork1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			int a = (int) (Math.random() * 100);
			arr[i] = a;
		}
		System.out.print("原数组                        ：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "	");
		}
		System.out.println(" ");
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("最大值                        ："+max);

		int[] a1=new int[0];		
		int[] a2=new int[11];
		a1=Arrays.copyOf(a2, a2.length);
		a1=Arrays.copyOf(arr, arr.length);
		a2[a2.length-1]=max;
		System.arraycopy(arr, 0, a2, 0, 10);
		System.out.print("副本                          ：");		
				for (int i = 0; i < a2.length; i++) {
					System.out.print(a2[i]+"	");			
		}
				System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			if(max==arr[i]){
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=max;
				int aa=arr[i];
				arr[i]=arr[arr.length-2];
				arr[arr.length-2]=aa;
				
				break;
				}
			}
		System.out.print("将数组中最大值放到最后一位     ：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"	");
		}
		System.out.println("	");
		int[] a3=new int[9];
		a3=Arrays.copyOf(arr, 9);		
		System.out.print("将最大值删除                  ：");
		for (int i = 0; i < a3.length; i++) {
			System.out.print(a3[i]+"	");
		}	
	}					
	}


