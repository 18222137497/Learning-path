package BSMN;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class BS {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8080);
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
//		BufferedReader br=new BufferedReader(new InputStreamReader(is,"utf-8"));
//		String len;
//		while((len=br.readLine())!=null) {
//			System.out.println(len);
//		}
		byte[] b=new byte[1024];
		int len =0;
		while((len=is.read(b))!=-1) {
			System.out.println(new String(b,0,len));
		}
	}
}
