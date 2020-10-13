package IO输入输出;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲字节流
 *  BuffInputStream    BuffOutputStream 
 *    缓冲字节输入流     缓冲字节输出流
 * 
 * @author 123
 *
 */

public class AadBuffInputStream {
	/*
	 * 字节输入缓冲区
	 */
	public static void main(String[] args) {
		File f = new File("C:\\Users\\123\\Desktop\\数理统计论文正文.docx");//实例化文件
		long state = System.currentTimeMillis();//获得当前毫秒数
		BufferedInputStream bf=null;//创建字节输入缓冲区，赋值为空！！！！！不能写在try catch语句里面
		FileInputStream fi = null;//创建字节输入流，赋值为空
		try {
			fi = new FileInputStream(f);//实例化文件字节输入流，传入参数（File文件）
			bf=new BufferedInputStream(fi);//实例化字节输入缓冲区，传入参数（输入流）
			byte by[]=new byte[1024];//规定输入字节数
			while(bf.read(by)!=-1){//读规定输入字节数量的字节
				
			}
			long end=System.currentTimeMillis();//获得当前毫秒数
			System.out.println("需要时间为："+(end-state)+"毫秒");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fi!=null) {
				try {
					fi.close();//关闭字节输入流
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bf!=null) {
				try {
					bf.close();//关闭字节输入缓冲区
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
class  BuffOutputStream{
	/*
	 *	字节输出缓冲区 
	 */
	public static void main(String[] args) {
		File f=new File("E:\\桌面\\java\\视频\\2第二篇 核心技术\\6第十五章 IO输入输出\\word.txt");
		FileOutputStream fo=null;//创建文件字节输出流，赋值为空
		BufferedOutputStream bo=null;//创建文件字节输出缓冲区，赋值为空
		try {
			fo=new FileOutputStream(f);//实例化文件字节输出流，参数（File文件）
			bo=new BufferedOutputStream(fo);//实例化文件字节输出流缓冲区，参数（文件字节输出流）
			String arr="今天是个好日子！";//输出的内容
			byte by[]=arr.getBytes();//得到输出的内容的字符串的字节码
			bo.write(by);//输出字节码
			bo.flush();//刷新！！！！强制将缓冲区的数据写入文件中，即使缓冲区没由填满
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fo!=null) {
				try {
					fo.close();//关闭字节输出流
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bo!=null) {
				try {
					bo.close();//关闭字节输出流缓冲区
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
 	}
	
}
