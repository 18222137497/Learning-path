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
		List<Emp> l=new ArrayList<Emp>();//�������ɶ��Emp����ļ���
		l.add(new Emp("zhangsan",18));
		l.add(new Emp("lisi",18));
		l.add(new Emp("wangwu",18)); 
		/*���л�*/
		ObjectOutput oot=new ObjectOutputStream(new FileOutputStream("IOFile\\Emp.txt"));
		oot.writeObject(l);//���л�д
		oot.close();
		/*�����л�*/
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("IOFile\\Emp.txt"));
		@SuppressWarnings("unchecked")//ѹ�ƾ��棬���ű�Ť
		ArrayList<Emp> obj=(ArrayList<Emp>)ois.readObject();//���л���
		for (Emp emp : obj) {
			System.out.println(emp);
		}
		ois.close();
		
		
	}
}
