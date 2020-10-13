package µİ¹é;

public class ÓÃµİ¹é½×³Ë {
	public static void main(String[] args) {
		System.out.println(p1(3));
	}
	public static int p1(int i) {
		if(i==1) {
			return 1;
		}
		return i*p1(--i);
	}
	
}
