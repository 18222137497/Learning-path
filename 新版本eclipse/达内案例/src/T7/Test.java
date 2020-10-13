package T7;

public class Test {
	public static void main(String[] args) {
		Train train = new Train();
		int max = train.MAX;
		System.out.println("收取费用最大值" + max);
		System.out.println("行驶2000公里后列车应抽取的费用" + train.getFee(2000));
	}
}
