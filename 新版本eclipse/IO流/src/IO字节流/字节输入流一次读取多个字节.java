package IO�ֽ���;

import java.io.FileInputStream;
import java.io.IOException;

public class �ֽ�������һ�ζ�ȡ����ֽ� {
/*
 * int read(byte[]);
 * int read(byte[],int off,int len);//��off����len����������ֵ�Ƕ��˼����ֽ�
 */
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt");
		byte[] b=new byte[1024];
		int len=0;
		while((len=f.read(b))!=-1) {//�̶���ʽһ��Ҫ��ס
			System.out.println(new String(b,0,len));
		}
		f.close();
		
	}
}
