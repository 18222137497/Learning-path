package T4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���Զ��建�����ķ�ʽʵ���ļ����ƶ�,ʹ��FileInputStream���read(byte[])������
 * FileOutputStream���write(byte[])����ʵ���ļ��ƶ�
 * 
 * @author ����
 *
 */
public class T4 {
	public static void main(String[] args) {
		Move_File("C:\\Users\\123\\Desktop\\z.txt", "C:\\Users\\123\\Desktop\\acd");// ���ļ��ƶ���ͬ�����ļ�����
		Move_File("C:\\Users\\123\\Desktop\\z.txt", "IOFile\\");// ���ļ��ƶ���ͬ�����ļ���
		Move_File("C:\\Users\\123\\Desktop\\z.txt", "C:\\Users\\123\\Desktop\\acd\\xc.txt");// ���ļ��ƶ�����ͬ�����ļ�����
		Move_File("C:\\Users\\123\\Desktop\\z.txt", "IOFile\\a.txt");// ���ļ��ƶ�����ͬ�����ļ���
	}

	/**
	 * �ƶ��ļ�����ͬ�̷���ͬ�̷��ķ����ǲ�һ����,ͬ�̷����ƶ�ԭ����Ǹı��ļ�·��,����ҪIO��ȡ��д��
	 * 
	 * @param f ��Ҫ�ƶ����ļ��ļ�·��
	 * @param x �ļ��ƶ�Ŀ�ĵ�·��
	 */
	public static void Move_File(String f, String x) {// ����Ϊ�˺��������дʹ���ַ�����Ϊ����,ʵ�ʹ��̺ͽ��������Ӱ��
		File f1 = new File(f);// �����ļ�·����File����
		File f2 = new File(x);
		if (f.toLowerCase().startsWith(x.substring(0, 1).toLowerCase())) {// �Աȿ�ͷ��ĸ�ж��Ƿ���ͬ�����ļ�
			if (f2.isDirectory()) {// ������ļ���
				String newFile = x + "/" + f1.getName();// ���ļ�·���޸�
				f1.renameTo(new File(newFile));// �����޸�·���ķ������������޸ĺ��·����File����
				System.out.println("ͬ�̷�,x�������ļ����ƶ��ɹ�");
			}
			if (f2.isFile()) {// ������ļ�
				String z = f2.getName();// ��ȡ����x��File������ļ���
				String[] y = x.split(z);// ������x���ļ���Ϊ�ָ�ֿ���
				String w = y[0] + f1.getName();// y[0]��Ϊx���ļ���·�����޸Ĳ���f���ļ�·��
				f1.renameTo(new File(w));// �޸�·��
				System.out.println("ͬ�̷�,x�������ļ��ƶ��ɹ�");
			}

		} else {
			FileInputStream fis = null;// ����������
			FileOutputStream fos = null;
			try {
				fis = new FileInputStream(f);// ������������
				if (f2.isDirectory()) {// �ж��Ƿ�Ϊ�ļ���
					String newFile = x + f1.getName();
					fos = new FileOutputStream(newFile);// �����ļ��ֽ�������Ĳ���
					System.out.println("��ͬ�̷�,x�������ļ����ƶ��ɹ�");
				}
				if (f2.isFile()) {// �ж��Ƿ�Ϊ�ļ�
					String z = f2.getName();
					String[] y = x.split(z);
					String w = y[0] + f1.getName();
					fos = new FileOutputStream(w);// �����ļ��ֽ�������Ĳ���
					System.out.println("��ͬ�̷�,x�������ļ��ƶ��ɹ�");
				}
				byte[] b = new byte[1024];
				int len = 0;
				while ((len = fis.read(b)) != -1) {// �����ļ�
					fos.write(b, 0, len);
				}

			} catch (Exception e) {
				System.out.println(e);
			} finally {// �ͷ���Դ
				if (fos != null) {
					try {
						fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}
}
