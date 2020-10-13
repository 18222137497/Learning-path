package day07;
//99³Ë·¨±íwhile
public class While {

	public static void main(String[] args) {
		int a=1;		
		while(a<10){
			int b=1;
			while(b<10){
				System.out.print(a+"*"+b+"="+a*b+"	");
				b++;
			}			
			a++;
			System.out.println();
		}
	

	}

}
