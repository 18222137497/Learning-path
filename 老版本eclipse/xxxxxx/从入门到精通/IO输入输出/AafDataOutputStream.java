package IO�������;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �������������
 * DateInputStream  DataOutputStream
 *    ����������       ���������
 * @author 123
 *
 */
public class AafDataOutputStream {
	/*
	 * �ļ����������
	 */
	public static void main(String[] args) {
		File f=new File("E:\\����\\java\\��Ƶ\\2�ڶ�ƪ ���ļ���\\6��ʮ���� IO�������\\word.txt");//��ȡ�ļ�
		FileOutputStream fo=null;//�����ļ������
		DataOutputStream dp=null;//�������������
		try {
			fo=new FileOutputStream(f);//ʵ�����ļ������
			dp=new DataOutputStream(fo);//ʵ�������������
			dp.writeUTF("�ҽ�����");//���UTF���ַ�������ʽ����
			dp.writeBoolean(true);//���Boolean��ʽ����
			dp.writeDouble(3.14);//���Double��ʽ����
			dp.writeChar('1');//���Char��ʽ����
			dp.writeInt(123);//���Int��ʽ����
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (dp!=null) {
				try {
					dp.close();//�ر����������
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fo!=null) {
				try {
					fo.close();//�ر��ļ������
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
				
	}
	
}
class ADataInputStream{
	/*
	 *	���������� 
	 */
	public static void main(String[] args) {
		File f=new File("E:\\����\\java\\��Ƶ\\2�ڶ�ƪ ���ļ���\\6��ʮ���� IO�������\\word.txt");//��ȡ�ļ�
		FileInputStream fi=null;//�����ļ�������
		DataInputStream di=null;//��������������
		try {
			fi=new FileInputStream(f);//ʵ�����ļ�������
			di=new DataInputStream(fi);//ʵ��������������
			System.out.println("readUTF��ȡ����	"+di.readUTF());
			System.out.println("readBoolean��ȡ����	"+di.readBoolean());
			System.out.println("readDouble��ȡ����	"+di.readDouble());
			System.out.println("readChar��ȡ����		"+di.readChar());
			System.out.println("readInt��ȡ����	"+di.readInt());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (di!=null) {
				try {
					di.close();//�ر�����������
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fi!=null) {
				try {
					fi.close();//�ر��ļ�������
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
