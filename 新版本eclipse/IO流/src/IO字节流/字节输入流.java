package IO�ֽ���;

import java.io.FileInputStream;
import java.io.IOException;

public class �ֽ������� {
/*
 *  int read();�����������ȡ���ݵ���һ���ֽ�
 *  int read(byte[] b);�����������ȡһ���������ֽڣ��������Ӱ�b��
 *  void closs;
 */
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt");
//		int a=f.read();//һ��һ����ȡ�ֽ�,����10�����ֽ���
//		System.out.println(a);//65
//		int b=f.read();//���ȡ��һ���ֽ�                                       ��ȡ����β�᷵��-1
//		System.out.println(b);//66
		int len =0;
		while((len=f.read())!=-1) {//���Ǹ��̶���ʽ
			System.out.print((char)len);//ת��
		}
		
		f.close();
	}
}
