package ���л���;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class �����л� {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\123\\Desktop\\bb.txt"));
		Object o=ois.readObject();//������׳����Ҳ����쳣����������IO�쳣
		ois.close();
		System.out.println(o);//Person [name=С��Ů, age=18]
	}
	
}
