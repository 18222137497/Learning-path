package API�ڶ�����;
/**
 * ��װ��
 * Integer Character
 * �Զ�װ����䣺JDK1.5֮����ֵ�������
 * @author 123
 *
 */
public class TextClass {
	public static void main(String[] args) {
		//װ��
		Integer a=new Integer(123);
		Integer b=Integer.valueOf(123);//int->Integer����
		Integer c=Integer.valueOf("123");//�ַ���->Integer����
		//����
		a.intValue();//Integer->int
	/*
	 * �����������ַ���֮����໥ת��
	 * ��������->�ַ���
	 * 		��������+""����򵥵ķ����������г��ã���
	 * 		��װ��ľ�̬����:toString(int i);
	 * 		String��ľ�̬����:valueOf(int i);
	 * �ַ���->�������� 	
	 * 		��װ��ľ�̬����:parseXXX("�ַ���");
	 */
		int z=0;
		String x=z+"";
		System.out.println(x);
		String y=Integer.toString(z);
		String v="1234";
		int m=Integer.parseInt(v);
		System.out.println(m);
		double n=Double.parseDouble(v);
		System.out.println(n);
		
	}
	
}
