package Function;

import java.util.function.Consumer;

/*
 * java.util.function.Consumer<T>�ӿڣ��׳�����ʽ�ӿ�
 * �����һ�����󷽷�accept(T t);
 * Consumer��Ĭ�Ϸ�����AndThen  ������������ʽ�ӿ�
 * 	����
 * 		Consumer<String> c1;
 * 		Consumer<String> c2;
 * 		c1.AndThen(c2).accept(String);��ִ��ǰ�������ʽ�ӿ�   !!!!!!!!
 */
public class Demo02Consumer {
	public static void main(String[] args) {
		acceptConsumer("����ӱ", (name)->System.out.println(new StringBuilder(name).reverse().toString()));
		//StringBuilder(name).reverse()   ���ַ�����ת
		AndThenConsumer("����ӱ",(name)->System.out.println(name)
				,(name)->System.out.println(new StringBuilder(name).reverse().toString()));
		String[] arr= {"����ӱ,Ů","��������,Ů","�������,��"};
		AndThenConsumer(arr,(string)->{
			String ar=string.split(",")[0];
			System.out.print("������"+ar+"	");
		},(string)->{
			String ar=string.split(",")[1];
			System.out.println("�Ա�"+ar);
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
