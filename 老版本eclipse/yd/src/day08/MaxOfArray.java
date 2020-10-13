package day08;

public class MaxOfArray {

	public static void main(String[] args) {
		int[]a=new int[5];
		
		int[] arr1={1,3,5};
		
		int[] arr2=new int[]{1,3,5};
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);			
		}
		System.out.println(arr2);
		int[] arr3;
		arr3=new int[]{1,3,5};
		
		int[] arr4=new int[3];
		arr4[0]=100;
		arr4[1]=200;
		arr4[2]=300;
		System.out.println(arr4[arr4.length-1]);
		
		int[] b=new int[10];
				for(int i=0;i<b.length;i++){
			b[i]=(int)(Math.random()*100);
			System.out.println(b[i]);
		}

	}

}
