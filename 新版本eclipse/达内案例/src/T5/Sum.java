package T5;

public class Sum implements OneToN {

	public int dispose(int n) {
		if (n == 0) {
			return 0;
		}
		return n + dispose(--n);
	}

}
