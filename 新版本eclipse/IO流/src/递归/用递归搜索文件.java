package 递归;

import java.io.File;

public class 用递归搜索文件 {
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
			//获得文件名（字符串类型），将文件名转换成小写，找结尾为"a.txt"，的文件名
			if (z.getName().toLowerCase().endsWith("a.txt")) {
				System.out.println(z);
			}
		}
	}
}
