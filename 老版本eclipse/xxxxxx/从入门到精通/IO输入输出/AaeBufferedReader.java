package IO输入输出;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件字符缓冲区
 *   BufferedReader     BufferedWriter
 * 文件字符输入缓冲区  文件字符输出缓冲区
 * @author 123
 *
 */
public class AaeBufferedReader {
	/*
	 * 文件字符输入缓冲区
	 */
	public static void main(String[] args) {
		File f=new File("E:\\桌面\\java\\视频\\2第二篇 核心技术\\6第十五章 IO输入输出\\word.txt");//获取文件
		long state=System.currentTimeMillis();//获取当前时间
		FileReader fr=null;//创建字符输入流
		BufferedReader br=null;//创建字符输入流缓冲区
		try {
			fr=new FileReader(f);//实例化字符输入流
			br=new BufferedReader(fr);//实例化字符输入流缓冲区
//			char ch[]=new char[1024];
//			int tmp;
//			while ((tmp=br.read(ch))!=-1) {
//				System.out.println(new String(ch));
//				
//			}
			
			String tmp=null;
			int i=1;
			while ((tmp=br.readLine())!=null) {//换行读字符
				System.out.println("第"+i+"行	"+tmp);
				i++;
			}
			long end=System.currentTimeMillis();//获取当前时间
			System.out.println("输入文件用时："+(end-state)+"毫秒");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fr!=null) {
				try {
					fr.close();//关闭字符输入流
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (br!=null) {
				try {
					br.close();//关闭字符输入缓冲区
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}			
	}
}
class BufferedWrite{
	/*
	 * 文件字符输出缓冲区
	 */
	public static void main(String[] args) {
	File f=new File("E:\\桌面\\java\\视频\\2第二篇 核心技术\\6第十五章 IO输入输出\\word.txt");//获取文件
	FileWriter fw=null;//创建文件字符输出流
	BufferedWriter bw=null;//创建文件字符输出流缓冲区
	try {
		fw=new FileWriter(f);//实例化文件字符输出流
		bw=new BufferedWriter(fw);//实例化文件字符输出流缓冲区
		String a="我有一直小毛驴，我从来也不骑！";//输出的字符串
		String b="我是吕洞宾！";
		bw.write(a);//输出字符串
		bw.newLine();//创建新行
		bw.write(b);//换行输出字符串
		bw.flush();//刷新
	} catch (IOException e) {
		e.printStackTrace();
	}finally {//谁最先创建的，谁最后关闭？？？？？？？ 先创建后关闭
		if (fw!=null) {
			try {
				fw.close();//关闭字符输出流
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (bw!=null) {
			try {
				bw.close();//关闭字符输出流缓冲区
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
