package T3;

import java.io.RandomAccessFile;

/**
 * ʵ���ļ��ĸ��ƹ���ʹ��RandomAccessFile���read(byte[])������write��byte[]������ʵ���ļ����ơ�
 * java.io.RandomAccessFile
 * 
 * @author ����
 *
 */
public class T3 {
	public static void main(String[] args) throws Exception {
		RandomAccessFile ra = new RandomAccessFile("IOFile\\a.txt", "r");// �ڶ��β���Ϊģʽ���� "r"�����
		RandomAccessFile rb = new RandomAccessFile("IOFile\\b.txt", "rw");// "rw"�������д
		byte[] b = new byte[1024];// ��������
		int len = 0;// ��������
		while ((len = ra.read(b)) != -1) {// ��
			rb.write(b, 0, len);// д
		}
		rb.close();// �ͷ���Դ
		ra.close();
	}
}
