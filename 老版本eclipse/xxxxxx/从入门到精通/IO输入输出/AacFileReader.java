package IO输入输出;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件字符流
 *  FileReader         FileWriter
 * 文件字符输入流	文件字符输出流
 * @author 123
 *
 */
public class AacFileReader {
	public static void main(String[] args) {
		File f=new File("E:\\桌面\\java\\视频\\2第二篇 核心技术\\6第十五章 IO输入输出\\word.txt");
		/*
		 * 文件字符输出流
		 */
		FileWriter w=null;
		try {
			w=new FileWriter(f,true);
			String arr="你见过洛杉矶：凌晨四点的样子吗？？？";
			w.write(arr);//因为是字符输出流，所以可以直接传字符串
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (w!=null) {
					w.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/*
		 * 文件字符输入流
		 */
		FileReader r=null;
		try {
			r=new FileReader(f);
			 char ch[]=new char[1024];//创建字符缓冲区
			 int count;//已读出的字符数
			 while ((count=r.read(ch))!=-1) {//循环读取文件中的数据知道字符都读完
				 System.out.println("文件内容为："+new String(ch,0,count));//去空格
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}finally {
			if (r!=null) {
				try {
					r.close();//关闭
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
