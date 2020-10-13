package IO输入输出;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据输入输出流
 * DateInputStream  DataOutputStream
 *    数据输入流       数据输出流
 * @author 123
 *
 */
public class AafDataOutputStream {
	/*
	 * 文件数据输出流
	 */
	public static void main(String[] args) {
		File f=new File("E:\\桌面\\java\\视频\\2第二篇 核心技术\\6第十五章 IO输入输出\\word.txt");//获取文件
		FileOutputStream fo=null;//创建文件输出流
		DataOutputStream dp=null;//创建数据输出流
		try {
			fo=new FileOutputStream(f);//实例化文件输出流
			dp=new DataOutputStream(fo);//实例化数据输出流
			dp.writeUTF("我叫汪京");//输出UTF（字符串）型式内容
			dp.writeBoolean(true);//输出Boolean型式类容
			dp.writeDouble(3.14);//输出Double型式类容
			dp.writeChar('1');//输出Char型式类容
			dp.writeInt(123);//输出Int型式类容
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (dp!=null) {
				try {
					dp.close();//关闭数据输出流
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fo!=null) {
				try {
					fo.close();//关闭文件输出流
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
				
	}
	
}
class ADataInputStream{
	/*
	 *	数据输入流 
	 */
	public static void main(String[] args) {
		File f=new File("E:\\桌面\\java\\视频\\2第二篇 核心技术\\6第十五章 IO输入输出\\word.txt");//获取文件
		FileInputStream fi=null;//创建文件输入流
		DataInputStream di=null;//创建数据输入流
		try {
			fi=new FileInputStream(f);//实例化文件输入流
			di=new DataInputStream(fi);//实例化数据输入流
			System.out.println("readUTF读取数据	"+di.readUTF());
			System.out.println("readBoolean读取数据	"+di.readBoolean());
			System.out.println("readDouble读取数据	"+di.readDouble());
			System.out.println("readChar读取数据		"+di.readChar());
			System.out.println("readInt读取数据	"+di.readInt());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (di!=null) {
				try {
					di.close();//关闭数据输入流
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fi!=null) {
				try {
					fi.close();//关闭文件输入流
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
