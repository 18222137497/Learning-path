package IO输入输出;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File类 （文件类）
 * @author 123
 *
 */
public class AaaFile {
	public static void main(String[] args) {
		File f2=new File("E:\\桌面\\java\\视频\\2第二篇 核心技术\\6第十五章 IO输入输出\\word.txtt");
		try {
			boolean b=f2.createNewFile();//创建文件
			System.out.println("文件创建是否成功："+b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f=new File("E:/延大/java测试/word.txt");
		Date d=new Date(f.lastModified());//得到文件最后修改时间，并将及改成时间模式（否则会输出毫秒数）
		SimpleDateFormat s=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//设置时间的输出格式
		System.out.println("文件的最后修改时间："+s.format(d));//将时间的的输出格式改成设定的s模式
		System.out.println("文件名："+f.getName());//得到文件或文件夹名
		System.out.println("文件是否为可读："+f.canRead());//判断文件是否为可读
		System.out.println("文件是否可被写入："+f.canWrite());//判断文件是否可被写入
		System.out.println("文件是否存在："+f.exists());//判断文件是否存在
		System.out.println("文件的字节长度为："+f.length());//获取文件的字符长度
		System.out.println("文件的绝对路径："+f.getAbsolutePath());//获取文件的绝对路径
		System.out.println("文件的父路径："+f.getParent());//获取文件父路径
		System.out.println("是否为文件："+f.isFile());//判断是否为文件
		System.out.println("是否为文件夹："+f.isDirectory());//判断是否为文件夹
		System.out.println("是否为隐藏文件："+f.isHidden());//判断是否为隐藏文件
		File f1=new File("E:\\桌面\\java\\视频\\2第二篇 核心技术\\6第十五章 IO输入输出");
		File[] arr=f1.listFiles();
		for (File fff : arr) {//输出文件夹内容
			if (fff.isFile()) {
				System.out.println("文件："+fff.getName());
			}else if (fff.isDirectory()) {
				System.out.println("文件夹："+fff.getName());
			}
		}
	}
	
}
