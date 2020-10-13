package xxxxx;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LX {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8080);
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		byte b[]=new byte[1024];
		int len=0;
		while ((len=is.read(b))!=-1) {
			System.out.println(new String(b,0,len));
		}
	}
}
