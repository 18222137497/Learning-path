package �ַ���;

import java.io.FileReader;
import java.io.IOException;

/**
 * �Ƽ�ʹ��jdk7��������
 * �� ��ʵ������try���������������Ͳ�������ʹ��close�����ͷ���Դ����trycatch�������쳣֮����Զ��ر����ͷ���Դ������
 * @author 123
 *
 */
public class ��trycatch�����쳣 {
	public static void main(String[] args) {
		try(FileReader f=new FileReader("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt")){//ע������
			char[] c=new char[1024];
			int len =0;
			while((len=f.read(c))!=-1) {
				System.out.println(new String(c,0,len));
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
