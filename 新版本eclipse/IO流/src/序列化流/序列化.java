package ���л���;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ���л� {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\123\\Desktop\\bb.txt"));
		oos.writeObject(new Person("С��Ů",18));
		//�� sr 序列化流.Person�y�b"?K I ageL namet Ljava/lang/String;xp   t 	小美�?
		oos.close();
	}
}
