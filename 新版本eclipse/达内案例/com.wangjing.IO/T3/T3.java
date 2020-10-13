package T3;

import java.io.RandomAccessFile;

/**
 * 实现文件的复制功能使用RandomAccessFile类的read(byte[])方法和write（byte[]）方法实现文件复制。
 * java.io.RandomAccessFile
 * 
 * @author 汪京
 *
 */
public class T3 {
	public static void main(String[] args) throws Exception {
		RandomAccessFile ra = new RandomAccessFile("IOFile\\a.txt", "r");// 第二课参数为模式参数 "r"代表读
		RandomAccessFile rb = new RandomAccessFile("IOFile\\b.txt", "rw");// "rw"代表读和写
		byte[] b = new byte[1024];// 缓冲数组
		int len = 0;// 设置索引
		while ((len = ra.read(b)) != -1) {// 读
			rb.write(b, 0, len);// 写
		}
		rb.close();// 释放资源
		ra.close();
	}
}
