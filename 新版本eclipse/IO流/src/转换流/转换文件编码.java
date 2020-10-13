package ת����;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ת���ļ����� {
/*
 * InputStreamReader:
 *  InputStreamReader(OutputStream out, String charsetName)
 *  String getEncoding() ���ش���ʹ�õ��ַ���������ơ� 
 *  
 *  
 * OutpuyStreamWriter:
 *  OutputStreamWriter(OutputStream out, String charsetName) ����ʹ��ָ���ַ����� OutputStreamWriter��
 *  String getEncoding() ���ش���ʹ�õ��ַ���������� 
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
