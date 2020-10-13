package IO字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class 字节输出流写出多个字节的方法 {
/*
 	void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。   打印多个字节的第一个方法
 	void write(byte[] b, int off, int len) 从指定的字节数组写入 "len个字节"，从偏移 off开始输出到此输出流。   第二个方法
 */
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("C:\\Users\\123\\Desktop\\文件集合\\a.txt");
		byte[] b= {63,64,65,66,67,68};
		//f.write(b);//第一个方法            ?@ABCD
		f.write(b,2,4);//从索引为2的地方开始，输出4个字节 	ABCD
		/*如果第一位是负数，那么第一位和第二位会组成一个汉字，2位为一组，第一个是负数那就变成汉字，直到不是负数为止，通过系统默认解码*/
		f.write(new byte[] {-65,-66,-21,-31});//烤脶
		byte[] z="您好啊".getBytes();
		f.write(z);//您好啊
		f.close();
	}
}
