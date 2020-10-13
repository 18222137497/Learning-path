package 过滤器;

import java.io.File;
import java.io.FileFilter;

public class 过滤器 {
	/*
	 * FileFilter(File f)接口 过滤器，需要重写accept方法
	 * FilenameFilter(File f,String name),把上面的方法变成了两个部分，后面是文件名=getName;前面是“一成不变”的根目录
	 */
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop");
		String arr=".txt";
		P1(f,arr);
	}
	public static void P1(File f,String arr) {
		File[] g=f.listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				if (pathname.isDirectory()) {
					P1(pathname,arr);
				}
				return pathname.getName().toLowerCase().endsWith(arr);
			}
		});
		for (File z:g) {
			System.out.println(z);
		}
		
		
	}
}
