package T7;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * ���ö��ı�
 * 
 * @author 123
 *
 */
public class T7 {
	public static void main(String[] args) throws Exception {
		File f = new File("IOFile/T.txt");
		FileReader fr = new FileReader(f);
		ArrayList<String> l = new ArrayList<String>();// ����Ŀ��ظ�������
		char[] c = new char[1];
		int len;
		while ((len = fr.read(c)) != -1) {
			l.add(new String(c));
		}
		for (int i = l.size() - 1; i > -1; i--) {
			System.out.print(l.get(i) + " ");
		}

	}
}
