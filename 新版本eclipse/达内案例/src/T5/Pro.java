package T5;

public class Pro implements OneToN {

	public int dispose(int n) {
		if (n == 1) {
			return 1;
		}
		return n * dispose(--n);
	}

}
