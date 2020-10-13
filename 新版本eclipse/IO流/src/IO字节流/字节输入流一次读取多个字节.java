package IO字节流;

import java.io.FileInputStream;
import java.io.IOException;

public class 字节输入流一次读取多个字节 {
/*
 * int read(byte[]);
 * int read(byte[],int off,int len);//从off读到len结束，返回值是读了几个字节
 */
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\123\\Desktop\\文件集合\\a.txt");
		byte[] b=new byte[1024];
		int len=0;
		while((len=f.read(b))!=-1) {//固定格式一定要记住
			System.out.println(new String(b,0,len));
		}
		f.close();
		
	}
}
