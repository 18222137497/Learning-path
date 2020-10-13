package day07;
//99³Ë·¨±ído¡£¡£¡£¡£while
public class Dowhile {

	public static void main(String[] args) {
		int a,b=1;
		do{
			a=1;
			System.out.println();
			do{
				System.out.print(""+a+"*"+b+"="+a*b+" ");
				a++;
			}while(a<10);
			b++;
		}while(b<10);

	}

}
