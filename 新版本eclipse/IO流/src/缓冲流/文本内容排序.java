package 缓冲流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class 文本内容排序 {
	public static void main(String[] args) throws IOException {
		HashMap<String,String> h=new HashMap<String, String>();
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\123\\Desktop\\aa.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\123\\Desktop\\bb.txt"));
		String line;
		while((line=br.readLine())!=null) {
			String[] arr=line.split("\\.");
			h.put(arr[0],arr[1]);
		}
		for (String s:h.keySet()) {
			bw.write(s+h.get(s));
			bw.newLine();
		}
		bw.close();
		br.close();
			
				
}
}
