package IO�������;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File�� ���ļ��ࣩ
 * @author 123
 *
 */
public class AaaFile {
	public static void main(String[] args) {
		File f2=new File("E:\\����\\java\\��Ƶ\\2�ڶ�ƪ ���ļ���\\6��ʮ���� IO�������\\word.txtt");
		try {
			boolean b=f2.createNewFile();//�����ļ�
			System.out.println("�ļ������Ƿ�ɹ���"+b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f=new File("E:/�Ӵ�/java����/word.txt");
		Date d=new Date(f.lastModified());//�õ��ļ�����޸�ʱ�䣬�������ĳ�ʱ��ģʽ������������������
		SimpleDateFormat s=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//����ʱ��������ʽ
		System.out.println("�ļ�������޸�ʱ�䣺"+s.format(d));//��ʱ��ĵ������ʽ�ĳ��趨��sģʽ
		System.out.println("�ļ�����"+f.getName());//�õ��ļ����ļ�����
		System.out.println("�ļ��Ƿ�Ϊ�ɶ���"+f.canRead());//�ж��ļ��Ƿ�Ϊ�ɶ�
		System.out.println("�ļ��Ƿ�ɱ�д�룺"+f.canWrite());//�ж��ļ��Ƿ�ɱ�д��
		System.out.println("�ļ��Ƿ���ڣ�"+f.exists());//�ж��ļ��Ƿ����
		System.out.println("�ļ����ֽڳ���Ϊ��"+f.length());//��ȡ�ļ����ַ�����
		System.out.println("�ļ��ľ���·����"+f.getAbsolutePath());//��ȡ�ļ��ľ���·��
		System.out.println("�ļ��ĸ�·����"+f.getParent());//��ȡ�ļ���·��
		System.out.println("�Ƿ�Ϊ�ļ���"+f.isFile());//�ж��Ƿ�Ϊ�ļ�
		System.out.println("�Ƿ�Ϊ�ļ��У�"+f.isDirectory());//�ж��Ƿ�Ϊ�ļ���
		System.out.println("�Ƿ�Ϊ�����ļ���"+f.isHidden());//�ж��Ƿ�Ϊ�����ļ�
		File f1=new File("E:\\����\\java\\��Ƶ\\2�ڶ�ƪ ���ļ���\\6��ʮ���� IO�������");
		File[] arr=f1.listFiles();
		for (File fff : arr) {//����ļ�������
			if (fff.isFile()) {
				System.out.println("�ļ���"+fff.getName());
			}else if (fff.isDirectory()) {
				System.out.println("�ļ��У�"+fff.getName());
			}
		}
	}
	
}
