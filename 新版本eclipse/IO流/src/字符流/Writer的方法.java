package �ַ���;

import java.io.FileWriter;
import java.io.IOException;

public class Writer�ķ��� {
/*
 * ���裺
 * 	1.����FileWriter����
 *  2.ʹ��FileWriter�е�write������������д�뵽�ڴ滺�����У�(�ַ�ת�����ֽڵĹ���)   ������ֽ�����ͬ!!!!!!!!!!
 *  3.ʹ��flush(ˢ��)����close�����ڴ滺����������ˢ�µ��ļ���
 *  4.�ͷ��ڴ�
 */
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt",true);
		f.write(97);
		f.flush();
		f.write(98);
		f.close();
	}
}
