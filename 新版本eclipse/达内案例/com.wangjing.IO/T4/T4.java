package T4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 用自定义缓存区的方式实现文件的移动,使用FileInputStream类的read(byte[])方法和
 * FileOutputStream类的write(byte[])方法实现文件移动
 * 
 * @author 汪京
 *
 */
public class T4 {
	public static void main(String[] args) {
		Move_File("C:\\Users\\123\\Desktop\\z.txt", "C:\\Users\\123\\Desktop\\acd");// 将文件移动到同磁盘文件夹里
		Move_File("C:\\Users\\123\\Desktop\\z.txt", "IOFile\\");// 将文件移动到同磁盘文件里
		Move_File("C:\\Users\\123\\Desktop\\z.txt", "C:\\Users\\123\\Desktop\\acd\\xc.txt");// 将文件移动到不同磁盘文件夹里
		Move_File("C:\\Users\\123\\Desktop\\z.txt", "IOFile\\a.txt");// 将文件移动到不同磁盘文件里
	}

	/**
	 * 移动文件到不同盘符和同盘符的方法是不一样的,同盘符的移动原理仅是改变文件路径,不需要IO读取再写入
	 * 
	 * @param f 需要移动的文件文件路径
	 * @param x 文件移动目的地路径
	 */
	public static void Move_File(String f, String x) {// 这里为了后续代码编写使用字符串作为参数,实际过程和结果并不受影响
		File f1 = new File(f);// 建立文件路径的File对象
		File f2 = new File(x);
		if (f.toLowerCase().startsWith(x.substring(0, 1).toLowerCase())) {// 对比开头字母判断是否是同磁盘文件
			if (f2.isDirectory()) {// 如果是文件夹
				String newFile = x + "/" + f1.getName();// 将文件路径修改
				f1.renameTo(new File(newFile));// 调用修改路径的方法，参数传修改后的路径的File对象
				System.out.println("同盘符,x参数传文件夹移动成功");
			}
			if (f2.isFile()) {// 如果是文件
				String z = f2.getName();// 获取参数x的File对象的文件名
				String[] y = x.split(z);// 将参数x以文件名为分割分开，
				String w = y[0] + f1.getName();// y[0]即为x的文件父路径，修改参数f的文件路径
				f1.renameTo(new File(w));// 修改路径
				System.out.println("同盘符,x参数传文件移动成功");
			}

		} else {
			FileInputStream fis = null;// 创建流对象
			FileOutputStream fos = null;
			try {
				fis = new FileInputStream(f);// 给流对象赋属性
				if (f2.isDirectory()) {// 判断是否为文件夹
					String newFile = x + f1.getName();
					fos = new FileOutputStream(newFile);// 定义文件字节输出流的参数
					System.out.println("不同盘符,x参数传文件夹移动成功");
				}
				if (f2.isFile()) {// 判断是否为文件
					String z = f2.getName();
					String[] y = x.split(z);
					String w = y[0] + f1.getName();
					fos = new FileOutputStream(w);// 定义文件字节输出流的参数
					System.out.println("不同盘符,x参数传文件移动成功");
				}
				byte[] b = new byte[1024];
				int len = 0;
				while ((len = fis.read(b)) != -1) {// 复制文件
					fos.write(b, 0, len);
				}

			} catch (Exception e) {
				System.out.println(e);
			} finally {// 释放资源
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
