package �Զ����쳣;

import java.util.Scanner;

/**
 * Exception: �������쳣
 * RuntimeException: �������쳣������jvm����
 * @author 123
 *
 */
public class NameException extends Exception{
	static String[] Name= {"����","����","����"};
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("�����봴�����û���");
		String name=scan.next();
		TF(name);
	}
	public static void TF(String name) {
		for (String nm:Name) {
			if (nm.equals(name)) {
				try {
				throw new RegisterException("���û��Ѿ���ע��");
				}catch(RegisterException e){
					e.printStackTrace();
					return;
				}
				}
		}
		System.out.println("��ϲ��ע�� �ɹ�");
	}
}
