package FS;

import java.lang.reflect.Constructor;

public class Demo02Constructor {
	public static void main(String[] args) throws Exception {
		Class<Person> c=Person.class;
	/*
	  获取构造方法们
	  Constructor<?>[] getConstructors();//获取类中的所有公共构造方法，返回Constructor对象
	  Constructor<T> getConstructor(类<?>...parameterTypes);//获取指定参数的公共构造方法，返回Constructor对象
	  Constructor<?>[] getDeclaredConstructors();//返回所有的构造方法，返回Constructor对象
	  Constructor<T> getDeclaredConstructor(类<?>...parameterTypes);//返回指定参数的构造方法，返回Constructor对象
	*/
		Constructor<Person> c1 = c.getConstructor(String.class,int.class);//获取类中的所有公共构造方法
		System.out.println(c1);//public 反射.Person(java.lang.String,int)
		System.out.println("-------------------");
		/*Constructor.newInstance(参数为constructor对象的参数列表) */
		Person person = c1.newInstance("我自己",21);//调用构造方法创建Person对象
		System.out.println(person);
		System.out.println("-------------------");
		//Person newInstance = c.newInstance();//调用无参构造方法的过期方法
		Person p = c.getDeclaredConstructor().newInstance();//调用无参构造方法返回一个object类型对象
		System.out.println(p);
		//c1.setAccessible(true);//暴力反射
	}
}
