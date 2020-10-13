package T1;

import java.io.File;
import java.io.FileFilter;

/**
 * ʹ�ó���IO��API���һ��Ŀ¼��������չ��Ϊ.txt���ļ�(��Ϊ.jar�ļ��Ƚ�����,���Ҵ��ڱ����������,�����õ���.txt��׺)
 * 
 * @author ����
 *
 */
public class T1 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\123\\Desktop");
		String arr = ".txt";
		Seek_File(f, arr);
	}

	/**
	 * ���ù�����ɸѡ������ָ����׺�ļ�
	 * 
	 * @param f   �ļ�·��
	 * @param arr ��Ҫ���ҵ��ļ���׺
	 */
	public static void Seek_File(File f, String arr) {
		File[] listFiles = f.listFiles(// ����ļ�·���µ��ļ�Ŀ¼(�����ļ����Լ��ļ�)
				new FileFilter() {// ʹ����ʵ����ӿ�FileFilter(�������ӿ�)��������ɸѡ
					@Override
					// ��дFileFilter�ӿ��еĳ��󷽷�accept(���˷������ж�Ϊtrue�ĲŻᱻ��������ֵ����)
					public boolean accept(File pathname) {// ����Ϊ��ǰ�����жϵ��ļ�·��������ǹ̶��ĸ�ʽ
						if (pathname.isDirectory()) {// �ж�Ŀǰ���ļ�·���Ƿ�Ϊ�ļ���
							Seek_File(pathname, arr);// ������ļ��У����ٴ�ִ��Seek_File����,����Ϊpathname(��ǰ�����жϵ��ļ�·��)
						}
						// �ж�����:��ȡ��ǰ·�����ļ���,���ļ������СдӢ�ģ��жϺ�׺�Ƿ�Ϊָ����׺
						return pathname.getName().toLowerCase().endsWith(arr);// ��Ϊ.txt��.TXT�ļ�������Сд������������Ҫ���Сд���Է����ѯ
					}
				});// ��ʱ���ص������ļ�·�����Ǿ���ɸѡ����
		for (File file : listFiles) {// ֱ�ӱ���listFiles
			System.out.println(file);// ����ֱ�Ӵ�ӡ�ļ�·��
		}
	}
}
