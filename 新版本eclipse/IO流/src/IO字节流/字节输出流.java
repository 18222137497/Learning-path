package IO字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class 字节输出流 {
/*
   java.io.OutputStream:字节输出流  此抽象类是所有输出字节流的父类
   
	定义了一些子类共性的成员方法：
	 void close() 关闭此输出流并释放与此流相关联的任何系统资源。  
	 void flush() 刷新此输出流并强制任何缓冲的输出字节被写出。  
	 void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。  
	 void write(byte[] b, int off, int len) 从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。  
	 abstract void write(int b) 将指定的字节写入此输出流。  

   FileOutputStream的构造方法：
	 FileOutputStream(File file) 创建文件输出流以写入由指定的 File对象表示的文件。 
	 FileOutputStream(String name) 创建文件输出流以指定的名称写入文件。 
	 
	写入数据的原理（内存->硬盘）
	java程序->JVM虚拟机->OS(操作系统)->OS调用写数据的方法->把数据写入到文件中 
 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\123\\Desktop\\文件集合\\a.txt");
		fos.write(97);
		fos.close();
	}
}
