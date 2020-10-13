package IO输入输出;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/***
 * FileIntStreatm    FileOutStreatm
 * 文件字节流的输入与输出         文件字节流
 * @author 123
 *
 */
public class AabFileInputStreatm {//文件字节输出流默认为覆盖，一次性填入
	public static void main(String[] args) {
		File f=new File("E:\\桌面\\java\\视频\\2第二篇 核心技术\\6第十五章 IO输入输出\\word.txt");
		FileOutputStream out=null;//文件字节输出流，设置为空
		try {
			out =new FileOutputStream(f,true);//实例化文件字节输出流，将文件夹作为参数传入，默认为false覆盖
			String arr="你见过洛杉矶；凌晨4点的样子吗?";
			byte[] b=arr.getBytes();//String型转byte型
			out.write(b);//将字节流写入文件中
		} catch (FileNotFoundException e) {//抛出文件异常
			e.printStackTrace();
		} catch (IOException e) {//抛出IO异常
			e.printStackTrace();
		}finally {
			if (out!=null) {//关闭文件字节输出流
				try {
					out.close();//关闭
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		FileInputStream in=null;//将输入流传空值
		try {
			in=new FileInputStream(f);//实例化输入流，参数为文件
			byte t[]=new byte[1024];//设置缓冲区
			int i1=in.read(t);//获得缓冲区的总字节数
			/*
			 * 将byte型转成字符串输出，长度为0到总字节数
			 */
			System.out.println("文本内容为："+new String(t,0,i1));//去掉多余缓冲区空格
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (in!=null) {
				try {
					in.close();//关闭
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
