package file;

import java.io.File;

public class File获取功能的方法 {
/*
     String getAbsolutePath() 返回此抽象路径名的“绝对路径”名字符串。 
 	 String getPath() 将此抽象路径名转换为“路径”名字符串。 
 	 String getName() 返回由此抽象路径名表示的文件或目录的“名称”。 
	 long length() 返回由此抽象路径名表示的文件的大小。 
 */
	public static void main(String[] args) {
		P1();
	}
	public static void P1() {
		File f=new File("C:\\Users\\123\\Desktop\\文件集合\\a.txt");
		System.out.println(f.getAbsolutePath());//返回绝对路径
		System.out.println(f.getPath());//返回路径
		System.out.println(f.getName());//返回文件名称
		System.out.println(f.length());//返回文件大小
	}
	
}
