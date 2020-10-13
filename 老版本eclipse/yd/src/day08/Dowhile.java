package day08;

public class Dowhile {
public static void main(String[] args) {
	int a,b=1;
	do{
		a=1;
		System.out.println();		
		do{
			b=1;
			System.out.println(" "+b+"+"+a+"="+a+b+" ");
			a++;
		}while(b<10);
//		b++;
	}while(a<10);
	
}
}
