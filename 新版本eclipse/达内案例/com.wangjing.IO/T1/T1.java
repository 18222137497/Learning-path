package T1;

import java.io.File;
import java.io.FileFilter;

/**
 * 使用常见IO的API输出一个目录中所有扩展名为.txt的文件(因为.jar文件比较难找,而且存在编码规则问题,这里用的是.txt后缀)
 * 
 * @author 汪京
 *
 */
public class T1 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\123\\Desktop");
		String arr = ".txt";
		Seek_File(f, arr);
	}

	/**
	 * 利用过滤器筛选并查找指定后缀文件
	 * 
	 * @param f   文件路径
	 * @param arr 需要查找的文件后缀
	 */
	public static void Seek_File(File f, String arr) {
		File[] listFiles = f.listFiles(// 获得文件路径下的文件目录(包含文件夹以及文件)
				new FileFilter() {// 使用无实现类接口FileFilter(过滤器接口)进行数据筛选
					@Override
					// 重写FileFilter接口中的抽象方法accept(过滤方法，判断为true的才会被当作返回值返回)
					public boolean accept(File pathname) {// 参数为当前正在判断的文件路径，这个是固定的格式
						if (pathname.isDirectory()) {// 判断目前的文件路径是否为文件夹
							Seek_File(pathname, arr);// 如果是文件夹，就再次执行Seek_File方法,参数为pathname(当前正在判断的文件路径)
						}
						// 判断条件:获取当前路径的文件名,将文件名变成小写英文，判断后缀是否为指定后缀
						return pathname.getName().toLowerCase().endsWith(arr);// 因为.txt与.TXT文件不区大小写，所以这里需要变成小写，以方便查询
					}
				});// 这时返回的所有文件路径都是经过筛选过的
		for (File file : listFiles) {// 直接遍历listFiles
			System.out.println(file);// 这里直接打印文件路径
		}
	}
}
