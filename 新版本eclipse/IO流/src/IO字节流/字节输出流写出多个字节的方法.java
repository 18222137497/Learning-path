package IO�ֽ���;

import java.io.FileOutputStream;
import java.io.IOException;

public class �ֽ������д������ֽڵķ��� {
/*
 	void write(byte[] b) �� b.length�ֽڴ�ָ�����ֽ�����д����������   ��ӡ����ֽڵĵ�һ������
 	void write(byte[] b, int off, int len) ��ָ�����ֽ�����д�� "len���ֽ�"����ƫ�� off��ʼ��������������   �ڶ�������
 */
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt");
		byte[] b= {63,64,65,66,67,68};
		//f.write(b);//��һ������            ?@ABCD
		f.write(b,2,4);//������Ϊ2�ĵط���ʼ�����4���ֽ� 	ABCD
		/*�����һλ�Ǹ�������ô��һλ�͵ڶ�λ�����һ�����֣�2λΪһ�飬��һ���Ǹ����Ǿͱ�ɺ��֣�ֱ�����Ǹ���Ϊֹ��ͨ��ϵͳĬ�Ͻ���*/
		f.write(new byte[] {-65,-66,-21,-31});//����
		byte[] z="���ð�".getBytes();
		f.write(z);//���ð�
		f.close();
	}
}
