package BSMN;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BS·þÎñÆ÷ {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8080);
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		BufferedReader bfis=new BufferedReader(new InputStreamReader(is,"UTF-8"));//×¢Òâ£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡
		String arr=bfis.readLine();
		String[] ar=arr.split(" ");
//		for (String st : ar) {
//			System.out.println(st);
//		}
		String htmlpath=ar[1].substring(1);
		System.out.println(htmlpath);
		FileInputStream fis=new FileInputStream(htmlpath);
		OutputStream os=s.getOutputStream();
		os.write("HTTP/1.1 200 OK\r\n".getBytes());
		os.write("Content-Type:text/html\r\n".getBytes());
		os.write("\r\n".getBytes());
		byte[] b=new byte[1024];
		int len;
		while ((len=fis.read(b))!=-1) {
			os.write(b, 0, len);
		}
		fis.close();
		s.close();
		ss.close();
		
	}
}
