package ����������;

public class Demo1 {
	public static void main(String[] args) {
		PP(Person::pl);//�÷������õ��ó�Ա����
	    PA(Person::new);//�÷������õ��ù��췽��
	    new Demo1().PZ();//�÷������õ���this����
	    ARR(2,int[]::new);//�÷������ù�������
	    ARR(2,r->new int[r]);//�����������ͬ��������Ƿ�������д��
	}
	public static void PP(CCC c) {
		c.Pri();
	}
	public void PZ() {
		PP(this::PC);
	}
	public static void PA(AAA c) {
		System.out.println(c.AA("���").getName());
	}
	public void PC() {
		System.out.println("�����");
	}
	public static int[] ARR(int i,BBB b) {
		return b.IN(i);
	}
}
