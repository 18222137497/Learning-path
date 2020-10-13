package T6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class T6 {
	public static void main(String[] args) throws Exception {
		File f = new File("IOFile/大老师语录.txt");// 创建文件的File对象
		/* 创建缓冲字符流，设置读取格式为UTF-8 */
		BufferedReader fbr = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
		String len = null;
		while ((len = fbr.readLine()) != null) {// 一行一行的读
			System.out.println(len);// 输出到控制台
		}
		fbr.close();// 释放资源
	}
}
