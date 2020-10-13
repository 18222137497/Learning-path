package 转换流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 转换文件编码 {
/*
 * InputStreamReader:
 *  InputStreamReader(OutputStream out, String charsetName)
 *  String getEncoding() 返回此流使用的字符编码的名称。 
 *  
 *  
 * OutpuyStreamWriter:
 *  OutputStreamWriter(OutputStream out, String charsetName) 创建使用指定字符集的 OutputStreamWriter。
 *  String getEncoding() 返回此流使用的字符编码的名称 
 */
	public static void main(String[] args) throws IOException{
		InputStreamReader ir=new InputStreamReader(
		new FileInputStream("C:\\Users\\123\\Desktop\\aa.txt"), "UTF-8");
		OutputStreamWriter ow=new OutputStreamWriter(
		new FileOutputStream("C:\\Users\\123\\Desktop\\bb.txt"), "GBK");
		int len=0;
		while((len=ir.read())!=-1) {
			ow.write(len);
		}
		ow.close();
		ir.close();
	}
}
