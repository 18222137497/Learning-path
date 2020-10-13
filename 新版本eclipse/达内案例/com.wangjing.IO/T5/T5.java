package T5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class T5 {
	public static void main(String[] args) throws Exception {
		List<Emp> l=new ArrayList<Emp>();//创建容纳多个Emp对象的集合
		l.add(new Emp("zhangsan",18));
		l.add(new Emp("lisi",18));
		l.add(new Emp("wangwu",18)); 
		/*序列化*/
		ObjectOutput oot=new ObjectOutputStream(new FileOutputStream("IOFile\\Emp.txt"));
		oot.writeObject(l);//序列化写
		oot.close();
		/*反序列化*/
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("IOFile\\Emp.txt"));
		@SuppressWarnings("unchecked")//压制警告，看着变扭
		ArrayList<Emp> obj=(ArrayList<Emp>)ois.readObject();//序列化读
		for (Emp emp : obj) {
			System.out.println(emp);
		}
		ois.close();
		
		
	}
}
