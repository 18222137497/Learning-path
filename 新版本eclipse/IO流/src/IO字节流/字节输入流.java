package IO字节流;

import java.io.FileInputStream;
import java.io.IOException;

public class 字节输入流 {
/*
 *  int read();从输入流里读取数据的下一个字节
 *  int read(byte[] b);从输入流里读取一定数量的字节，并储存子啊b里
 *  void closs;
 */
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\123\\Desktop\\文件集合\\a.txt");
//		int a=f.read();//一个一个读取字节,返回10进制字节码
//		System.out.println(a);//65
//		int b=f.read();//会读取下一个字节                                       读取到结尾会返回-1
//		System.out.println(b);//66
		int len =0;
		while((len=f.read())!=-1) {//这是个固定格式
			System.out.print((char)len);//转型
		}
		
		f.close();
	}
}
