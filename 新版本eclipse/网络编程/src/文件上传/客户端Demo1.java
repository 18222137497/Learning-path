package 文件上传;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class 客户端Demo1 {
	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("src/box.jpg");
	Socket s=new Socket("127.0.0.1",9999);
	OutputStream os=s.getOutputStream();
	byte[] b=new byte[1024];
	int len;
	while((len=fis.read(b))!=-1) {
		os.write(b, 0, len);
	}
	/*
	 * 给服务器写一个结束标记
	 * 	
	 */
	s.shutdownOutput();//禁用此套接字得输出流
	InputStream i=s.getInputStream();
	byte[] bb=new byte[1024];
	int lenn;
	while((lenn=i.read(bb))!=-1) {
		System.out.println(new String(bb,0,lenn));
	}
	
	s.close();
}
}
