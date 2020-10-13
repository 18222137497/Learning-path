package 字符流;

import java.io.FileReader;
import java.io.IOException;

public class Reader的方法 {
	/*
	 * 共性方法：
	 * int read();
	 * int read(byte[]);
	 * int read(byte[],int off ,int len);
	 * void close();
	 */
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("C:\\Users\\123\\Desktop\\文件集合\\a.txt");
		char[] c=new char[1024];
		int len = 0;
		while((len=f.read(c))!=-1) {
			System.out.println(new String(c,0,len));
		}
		f.close();
	}
}
