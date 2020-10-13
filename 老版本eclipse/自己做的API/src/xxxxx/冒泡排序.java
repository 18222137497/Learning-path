package xxxxx;
/**
 * ц╟ещеепР
 * @author 123
 *
 */
public class ц╟ещеепР {
	public static void main(String[] args) {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
			for (int i = 0; i < arr.length-1; i++) {	
				for (int j = 0; j < arr.length-i-1; j++) {
					if (arr[j+1] < arr[j]) {
						int a = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = a;
					}
			
				}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"	");
		}
		

	}

}
