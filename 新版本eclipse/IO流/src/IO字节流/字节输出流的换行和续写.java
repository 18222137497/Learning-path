package IO�ֽ���;

import java.io.FileOutputStream;
import java.io.IOException;

public class �ֽ�������Ļ��к���д {
	/*
	 * void FileOutputStream(File f,boolean b)//�������жϿ��أ�trueΪ��д
	 * void FileOutputStream(String s,boolean b)
	 * ���У�
	 * 		windows: \r\n     \n��ʵҲ��
	 * 		Linux:	\n
	 * 		mac:	\r
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("C:\\Users\\123\\Desktop\\�ļ�����\\a.txt",true);
		for (int i = 0; i < 3; i++) {
			f.write("����".getBytes());
			f.write("\r\n".getBytes());
		}
		f.close();
	}
}
