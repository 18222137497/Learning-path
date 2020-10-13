package Function;

import java.util.function.Consumer;

/*
 * java.util.function.Consumer<T>接口，俗称消费式接口
 * 里面的一个抽象方法accept(T t);
 * Consumer的默认方法：AndThen  连接两个消费式接口
 * 	例：
 * 		Consumer<String> c1;
 * 		Consumer<String> c2;
 * 		c1.AndThen(c2).accept(String);先执行前面的消费式接口   !!!!!!!!
 */
public class Demo02Consumer {
	public static void main(String[] args) {
		acceptConsumer("赵丽颖", (name)->System.out.println(new StringBuilder(name).reverse().toString()));
		//StringBuilder(name).reverse()   将字符串反转
		AndThenConsumer("赵丽颖",(name)->System.out.println(name)
				,(name)->System.out.println(new StringBuilder(name).reverse().toString()));
		String[] arr= {"赵丽颖,女","古力娜扎,女","马尔扎哈,男"};
		AndThenConsumer(arr,(string)->{
			String ar=string.split(",")[0];
			System.out.print("姓名："+ar+"	");
		},(string)->{
			String ar=string.split(",")[1];
			System.out.println("性别："+ar);
		});
	}
	public static void acceptConsumer(String name,Consumer<String> con) {
		con.accept(name);
	}
	public static void AndThenConsumer(String name,Consumer<String> c1,Consumer<String> c2) {
		c1.andThen(c2).accept(name);
	}
	public static void AndThenConsumer(String[] name,Consumer<String> c1,Consumer<String> c2) {
		for (String string : name) {
			c1.andThen(c2).accept(string);
		}
	}
}
