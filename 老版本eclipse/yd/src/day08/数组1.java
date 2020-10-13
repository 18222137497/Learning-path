package day08;

public class สýื้1 {

	public static void main(String[] args) {
		int[] a=new int[10];
		for(int i=0;i<a.length;i++){
			a[i]=(int)(Math.random()*10);
		}
		int[] a1=new int[]{1,2,3,4,5,6,7,8,9,10};
		
		System.arraycopy(a, 1, a1, 0, 3);
		for(int b=0;b<a1.length;b++){
			System.out.println(a1[b]);
			
		}

	}

}
