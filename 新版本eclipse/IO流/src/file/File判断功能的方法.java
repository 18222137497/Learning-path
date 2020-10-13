package file;

import java.io.File;

public class File判断功能的方法 {
/*
	boolean exists() 测试此抽象路径名表示的“文件或目录是否存在”。 
	boolean isDirectory() 测试此抽象路径名表示的文件是否为目录。 “是非为文件夹”
	boolean isFile() 测试此抽象路径名表示的文件“是否为普通文件”。 
 */
	public static void main(String[] args) {
		File f=new File("C:\\Users\\123\\Desktop\\文件集合\\a.txt");
		System.out.println(f.exists());//文件或文件夹是否存在
		System.out.println(f.isDirectory());//是否为文件夹
		System.out.println(f.isFile());//是否为文件
	}
}
