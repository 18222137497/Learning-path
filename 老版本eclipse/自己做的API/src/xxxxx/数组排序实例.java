package xxxxx;

import java.util.Arrays;

public class Êı×éÅÅĞòÊµÀı {
	public static void main(String[] args) {
	int[][] arr=new int[][]{
		{1,2,3,4},
		{5,6,7,8},
		{9,1,2,3},
		{4,5,6,7}
	};
//	GreatWang.ABC(arr);
	GreatWang.QPX(arr);
//for (int i = 0; i < arr.length-1; i++) {
//	for (int j = 0; j < arr[i].length-1; j++) {
//	if (arr[i][j]>arr[i][j+1]) {
//		int a2=arr[i][j];
//		arr[i][j]=arr[i][j+1];
//		arr[i][j+1]=a2;
//	}
//	}
//	}

	for (int i = 0; i < arr.length ; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			
			System.out.print(arr[i][j]+"	");
		}
		System.out.println();
	}



	}
}

