package �������Ա����ƪ;
/**
 * String��
 * @author 123
 *
 */
public class AString {
	public static void main(String[] args) {
		String a="12a4ac6a7e9";
		/*
		 * ��ָ���ַ������ӵ����ַ�����ĩβ
		 */
		String a1=a.concat("987654321");//������Ϊ�����ַ������ַ���   a+b
		System.out.println(a1);
		System.out.println(a.charAt(8));//����ַ���ָ���±���ַ�
		System.out.println(a.indexOf("3"));//��ȡĿ�����ַ�����һ�γ��ֵ�����,û�з���-1
		System.out.println(a.substring(2,7));//��ָ��λ�ý�ȡ�ַ������ַ���ָ��λ��
		/*�ַ���ת��*/
		char[] c=a.toCharArray();//ת��Ϊ�ַ�����
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		byte[] b=a.getBytes();//ת��Ϊ�ֽ�����
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		/*���ַ�������ַ���Ϊ�����ַ�*/
		String a2=a.replace("a","*");
		System.out.println(a2);
		/*�ַ����ָ�*/
		String[] a4=a.split("a");
		for (int i = 0; i < a4.length; i++) {
			System.out.print(a4[i]+" ");
		}
		
}
}
