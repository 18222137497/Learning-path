package 序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class 序列化 {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\123\\Desktop\\bb.txt"));
		oos.writeObject(new Person("小美女",18));
		// sr 搴忓垪鍖栨祦.Person恲筨"?K I ageL namet Ljava/lang/String;xp   t 	灏忕編濂?
		oos.close();
	}
}
