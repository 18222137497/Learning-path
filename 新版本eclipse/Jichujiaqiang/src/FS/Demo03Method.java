package FS;

import java.lang.reflect.Method;
/**
 * 需要注意的是！！！！！！：
 * 		getMeThods方法返回的公共成员方法包含其父类Object类中的公共方法
 * 		而getDeclaredMethods()方法并不返回父类Object类中的方法
 * @author 123
 *
 */
public class Demo03Method {
	public static void main(String[] args) throws Exception {
		Class<Person> c=Person.class;
		/*
		  获取构造方法们
		  Method[] getMethods();//获取类中的所有公共成员方法，返回Method对象
		  Method getMethod(String name,类<?>...parameterTypes);//获取指定参数的公共成员方法，返回Method对象
		  Method[] getDeclaredMethods();//返回所有的成员方法，返回Method对象
		  Method getDeclaredMethod(String name,类<?>...parameterTypes);//返回指定参数的成员方法，返回Method对象
		*/
		Method[] methods = c.getDeclaredMethods();//获取类中所有的成员方法，返回Method数组    
		for (Method method : methods) {
			method.setAccessible(true);//暴力反射
			System.out.println(method);
			System.out.println(method.getName());//获得成员方法的名称
		}
		System.out.println("--------------------");
		Person p = new Person();
		Method method = c.getMethod("add",int.class);//获取指定的公共成员方法，参数为方法名和方法参数的.class
		method.invoke(p, 1);//传递参数并执行方法,如果是静态方法前面的参数可以直接传null
		Object object;
	}
}
