package �ݹ�;

public class �ݹ�������� {
	/*
	 ֱ�ӵݹ�ͼ�ӵݹ�
	 �ݹ����˼�����Լ������Լ������ǲ������ߵ��û��ߴ���̫�࣬��Ȼ�����ջ�ڴ����״������ÿ��ջ���ڴ��С��һ����
	 ���췽�����ܵ����Լ�
	 */
	public static void main(String[] args) {
	p1(1);
}
	public static void p1(int i) {
		System.out.println(i);
		if (i>10) {//���õݹ����
			return;
		}
		p1(++i);
	}
	//��ӵݹ�
	/*
	 * p1(){
	 * 		c1();
	 * }
	 * c1(){
	 * 		p1();
	 * }
	 */
}
