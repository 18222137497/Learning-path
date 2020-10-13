package file;

import java.io.File;

public class File的构造方法 {
	/*
	File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。  
	File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。  
	File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例。  
	File(URI uri) 通过将给定的 file: URI转换为抽象路径名来创建新的 File实例。  
*/
	public static void main(String[] args) {
		//P1();
		P2();
	}
	//File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。  
	public static void P1(){
		File F=new File("C:\\Users\\123\\Desktop\\文件集合\\a.txt");
		System.out.println(F);
	}
	//File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。
	//File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例。
	public static void P2() {
		File F=new File("C:\\Users\\123\\Desktop\\文件集合"    ,   "a.txt");
		System.out.println(F);
	}
	
} 
