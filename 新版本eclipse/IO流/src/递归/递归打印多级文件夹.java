package 递归;

import java.io.File;

public class 递归打印多级文件夹 {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop\\文件集合");
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