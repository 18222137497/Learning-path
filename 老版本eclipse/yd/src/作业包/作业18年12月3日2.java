package ��ҵ��;

public class ��ҵ18��12��3��2 {

	public static void main(String[] args) {
		int[] a=new int[10];
		for(int i=0;i<a.length;i++){
			a[i]=(int)(Math.random()*100+1);
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
			}
		
		System.out.println("����");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
				
		}

	}

}
