package �ݹ�;

import java.io.File;

public class �ݹ��ӡ�༶�ļ��� {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop\\�ļ�����");
		P1(f);
	}
	public static void P1(File f) {
		File[] g=f.listFiles();
		for (File z:g) {
			System.out.println(z);
			if (z.isDirectory()) {
				P1(z);
			}
		}
	}
}