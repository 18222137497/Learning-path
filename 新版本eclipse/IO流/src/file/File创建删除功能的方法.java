package file;

import java.io.File;
import java.io.IOException;

public class File创建删除功能的方法 {
/*
	boolean createNewFile() 当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。 
	boolean delete() 删除由此抽象路径名表示的文件或目录。    “删除不走回收站！！！！！！！！”
	boolean mkdir() 创建由此抽象路径名命名的目录。   “创建单级文件夹”
	boolean mkdirs() 创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。	“创建多级文件夹” 
 */
	public static void main(String[] args) {
	File f=new File("C:\\Users\\123\\Desktop\\文件集合\\a.txt");
	/*boolean createNewFile()，创建成功返回true，失败返回false*/
	try {
		System.out.println(f.createNewFile());
	} catch (IOException e) {
		e.printStackTrace();
	}
	/*boolean delete() 删除由此抽象路径名表示的文件或目录,删除成功返回true，删除失败false*/
	//System.out.println(f.delete());
	/*boolean mkdir()*/
	File a=new File("C:\\Users\\123\\Desktop\\文件集合\\新的文件夹");
	System.out.println(a.mkdir());
	/*boolean mkdirs() 创建多级文件夹*/
	File b=new File("C:\\Users\\123\\Desktop\\文件集合\\新的文件夹\\新的文件夹\\新的文件夹");
	System.out.println(b.mkdirs());
	System.out.println(b.delete());//删除最底层的一个文件夹
	System.out.println(a.delete());//因为文件夹里有文件所以删不了
}
}
