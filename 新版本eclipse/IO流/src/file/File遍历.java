package file;

import java.io.File;

public class File遍历 {
	/*
	String[] list() 返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。  
	File[] listFiles() 返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。 
 */
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop\\文件集合");
		
		
		for (String arr:f.list()) {
			System.out.println(arr);
		}
		
		
		for (File a : f.listFiles()) {
			System.out.println(a);
		}
		
	}
}
