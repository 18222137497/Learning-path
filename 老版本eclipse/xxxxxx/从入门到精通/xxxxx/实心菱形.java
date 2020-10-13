package xxxxx;

public class ÊµĞÄÁâĞÎ {
	public static void main(String[] args){
		for (int i = 0; i < 10; i++) {
			for (int j = 9-i; j >0 ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 8-i; j < 9; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (8-i)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
