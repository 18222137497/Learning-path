package Function;

import java.util.function.Supplier;

/*
 *	java.util.function.Supplier<T> 接口包含一个无参的方法：T get();用来获取一个泛型参数指定类型的对象数据
 *
 *	这个接口也被称之为生产型接口，指定接口的泛型是什么，就返回什么类型的数据
 */
public class Demo01Supplier {
	public static void main(String[] args) {
		System.out.println(getSupplier(()->"我自己"));
	}
	public static String getSupplier(Supplier<String> sup) {
		return sup.get();
	}
}
