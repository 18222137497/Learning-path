package 序列化流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 反序列化 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\123\\Desktop\\bb.txt"));
		Object o=ois.readObject();//这里会抛出类找不到异常，并不属于IO异常
		ois.close();
		System.out.println(o);//Person [name=小美女, age=18]
	}
	
}
