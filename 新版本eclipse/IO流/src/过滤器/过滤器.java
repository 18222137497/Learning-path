package ������;

import java.io.File;
import java.io.FileFilter;

public class ������ {
	/*
	 * FileFilter(File f)�ӿ� ����������Ҫ��дaccept����
	 * FilenameFilter(File f,String name),������ķ���������������֣��������ļ���=getName;ǰ���ǡ�һ�ɲ��䡱�ĸ�Ŀ¼
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
