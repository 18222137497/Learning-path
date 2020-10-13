package 缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class 字节缓冲流的特殊方法 {
/*
 * 字节缓冲输出流的方法
 *  void newLine() 写入一个行分隔符。 
 * 字节缓冲输入流的方法
 * 	String readLine() 读一行字符，没有字符返回null 
 */
	public static void main(String[] args) throws IOException {
	BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\123\\Desktop\\文件集合\\a.txt"));
	System.out.println(bf.readLine());//compareable 
	System.out.println(bf.readLine());//null
	bf.close();
	}
}
