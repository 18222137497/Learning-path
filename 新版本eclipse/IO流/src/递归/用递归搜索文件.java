package �ݹ�;

import java.io.File;

public class �õݹ������ļ� {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop");
		String arr="a.txt";
		P1(f,arr);
	}
	public static void P1(File f,String arr) {
		File[] g=f.listFiles();
		for(File z:g) {
			if (z.isDirectory()) {
				P1(z,"a.txt");
			}
			//����ļ������ַ������ͣ������ļ���ת����Сд���ҽ�βΪ"a.txt"�����ļ���
			if (z.getName().toLowerCase().endsWith("a.txt")) {
				System.out.println(z);
			}
		}
	}
}
