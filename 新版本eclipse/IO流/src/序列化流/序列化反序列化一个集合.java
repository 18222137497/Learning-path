package ���л���;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ���л������л�һ������ {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ArrayList<Person> l=new ArrayList<Person>();
		l.add(new Person("����",18));
		l.add(new Person("����",19));
		l.add(new Person("����",17));
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("C:\\Users\\123\\Desktop\\bb.txt"));
		os.writeObject(l);
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\123\\Desktop\\cc.txt"));
		ArrayList<Person> arr=(ArrayList<Person>) ois.readObject();
		for (Person person : arr) {
			System.out.println(person);
		}
		ois.close();
		os.close();
	}
}
