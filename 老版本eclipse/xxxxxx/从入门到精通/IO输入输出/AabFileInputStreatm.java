package IO�������;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/***
 * FileIntStreatm    FileOutStreatm
 * �ļ��ֽ��������������         �ļ��ֽ���
 * @author 123
 *
 */
public class AabFileInputStreatm {//�ļ��ֽ������Ĭ��Ϊ���ǣ�һ��������
	public static void main(String[] args) {
		File f=new File("E:\\����\\java\\��Ƶ\\2�ڶ�ƪ ���ļ���\\6��ʮ���� IO�������\\word.txt");
		FileOutputStream out=null;//�ļ��ֽ������������Ϊ��
		try {
			out =new FileOutputStream(f,true);//ʵ�����ļ��ֽ�����������ļ�����Ϊ�������룬Ĭ��Ϊfalse����
			String arr="�������ɼ���賿4���������?";
			byte[] b=arr.getBytes();//String��תbyte��
			out.write(b);//���ֽ���д���ļ���
		} catch (FileNotFoundException e) {//�׳��ļ��쳣
			e.printStackTrace();
		} catch (IOException e) {//�׳�IO�쳣
			e.printStackTrace();
		}finally {
			if (out!=null) {//�ر��ļ��ֽ������
				try {
					out.close();//�ر�
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		FileInputStream in=null;//������������ֵ
		try {
			in=new FileInputStream(f);//ʵ����������������Ϊ�ļ�
			byte t[]=new byte[1024];//���û�����
			int i1=in.read(t);//��û����������ֽ���
			/*
			 * ��byte��ת���ַ������������Ϊ0�����ֽ���
			 */
			System.out.println("�ı�����Ϊ��"+new String(t,0,i1));//ȥ�����໺�����ո�
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (in!=null) {
				try {
					in.close();//�ر�
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
