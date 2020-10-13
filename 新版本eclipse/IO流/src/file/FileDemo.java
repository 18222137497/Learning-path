package file;

import java.io.File;

/**
 * file：文件
 * directory：文件夹/目录
 * path：路径
 * @author 123
 *
 */
public class FileDemo {

/*
 	static String pathSeparator 与系统相关的路径分隔符字符，为方便起见，表示为字符串。  
	static char pathSeparatorChar 与系统相关的路径分隔符。  
	
	static String separator 与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。  
	static char separatorChar 与系统相关的默认名称分隔符。  

 */
	public static void main(String[] args) {
		String pathSeparator=File.pathSeparator;//路径分割符 windows:分号; 	Linux:冒号:
		System.out.println(pathSeparator);
		/*	一般文件路径写法C:\develop\a\a.txt   windows
		 				C:/develop/a/a.txt	 Linux
		 	统用文件路径写法 例: 	"C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
		*/
		String Separator=File.separator;//文件分割符 windows:反斜杠\ 		Linux:正斜杠/
		System.out.println(Separator);
		
	}
	
}
