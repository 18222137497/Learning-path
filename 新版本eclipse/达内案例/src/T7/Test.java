package T7;

public class Test {
	public static void main(String[] args) {
		Train train = new Train();
		int max = train.MAX;
		System.out.println("��ȡ�������ֵ" + max);
		System.out.println("��ʻ2000������г�Ӧ��ȡ�ķ���" + train.getFee(2000));
	}
}
