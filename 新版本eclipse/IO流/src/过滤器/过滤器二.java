package 过滤器;

import java.io.File;

public class 过滤器二 {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop");
		P1(f);
	}
	public static void P1(File f) {//fir参数是一成不变的根目录=="C:\\Users\\123\\Desktop"
		File[] g=f.listFiles((fir,name)->fir.isDirectory()||name.toLowerCase().endsWith(".txt"));
		for (File z:g) {
			if (z.isDirectory()) {
				P1(z);
			}
			System.out.println(z);
		}
	}
}
