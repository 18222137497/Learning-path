package ������;

import java.io.File;

public class �������� {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop");
		P1(f);
	}
	public static void P1(File f) {//fir������һ�ɲ���ĸ�Ŀ¼=="C:\\Users\\123\\Desktop"
		File[] g=f.listFiles((fir,name)->fir.isDirectory()||name.toLowerCase().endsWith(".txt"));
		for (File z:g) {
			if (z.isDirectory()) {
				P1(z);
			}
			System.out.println(z);
		}
	}
}
