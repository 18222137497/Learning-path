package FS;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 需求：写一个"框架"，不能在不能改变类的任何代码的前提下，可以帮助我们创建类的任意对象
 * 	实现：
 * 		1.配置文件
 * 		2.反射
 * 	步骤：
 * 		1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 * 		2.在程序中加载读取配置文件
 * 		3.使用反射技术来加载文件进内存
 * 		4.创建对象
 * 		5.执行方法
 * @author 123
 *
 */
public class AL {
	public static void main(String[] args) throws Exception {
		//1.加载配置文件
		//1.1创建Properties对象
		Properties p = new Properties();
		//1.2加载配置文件转换成一个集合
		//1.2.1获取class目录下的配置文件
		/*ClassLoader getClassLoader() 返回类的类加载器。类的加载器是java流行的关键因素,从jdk1.0就存在*/
		ClassLoader classLoader = AL.class.getClassLoader();//获取类的类加载器
		/*这里可能抛出空指针异常，也就是没找到文件所以导入不进Properties集合
		     我的解决方法为在同项目下创建一个新的Source Folder(源文件夹),将配置文件放到新的Source Folder中
		     我在第一次执行代码的时候出现了空指针异常，因为我将配置文件放到了与该类同根的源文件夹*/
		/*InputStream getResourceAsStream(String name) 返回用于读取指定资源的输入流。参数为文件路径 */
		InputStream resourceAsStream = classLoader.getResourceAsStream("a.properties");
		/*void load(InputStream i)储存键值对的文件当中，键与值的默认连接符号可以是=,空格(其他符号)*/
		p.load(resourceAsStream);
		//2.获取配置文件中定义的数据
		String className=p.getProperty("classname");//等同于Map集合中的get方法，通过键找值
		String methodName=p.getProperty("methodName");
		//3.加载该类进内存
		Class c = Class.forName(className);//获得类的类对象
		//4.创建对象
		Object newInstance = c.getDeclaredConstructor().newInstance();//创建对象(空参数)
		//5.获取对象的方法
		Method m = newInstance.getClass().getMethod(methodName);//获取对象的方法，这里是没有参数的方法
		//6.执行方法
		m.invoke(newInstance);//执行方法
		
		
		
		
		
		
		
		
		
		
	}
}
