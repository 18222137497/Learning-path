package 打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class 打印流 {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("我是控制台");
		PrintStream p=new PrintStream("C:\\Users\\123\\Desktop\\bb.txt");
		p.println("我是文件里");
		System.setOut(p);//把输出语句的目的地改为打印流的目的地
		System.out.println("我也是文件里");
		
		
	}
	
}
