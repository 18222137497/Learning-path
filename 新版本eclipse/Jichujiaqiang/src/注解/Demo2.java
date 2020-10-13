package 注解;

import java.lang.reflect.Method;
/**
 * 反射案例用注解解决
 * @author 123
 *
 */
@Pro(className = "注解.Demo01", methodName = "show1")
public class Demo2 {
	public static void main(String[] args) throws Exception {
		// 1.解析注释
		// 1.1获取该类的字节码文件对象
		Class<Demo2> c = Demo2.class;
		// 2.获取上面的注释对象
		Pro an = c.getAnnotation(Pro.class);// 其实就是在内存中生成了一个该注解接口的子类实现对象
		// 3.调用注解中定义的抽象方法，获取返回值
		String className = an.className();
		String methodName = an.methodName();
		// 3.1加载该类进内存
		Class f = Class.forName(className);// 获得类的类对象
		// 4.创建对象
		Object newInstance = f.getDeclaredConstructor().newInstance();// 创建对象(空参数)
		// 5.获取对象的方法
		Method m = newInstance.getClass().getMethod(methodName);// 获取对象的方法，这里是没有参数的方法
		// 6.执行方法
		m.invoke(newInstance);// 执行方法
	}
}
