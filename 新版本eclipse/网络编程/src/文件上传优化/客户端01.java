package 文件上传优化;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class 客户端01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("src/box.jpg");
		Socket s=new Socket("127.0.0.1",11111);
		OutputStream os=s.getOutputStream();
		InputStream is=s.getInputStream();
		byte[] b=new byte[1024];
		int len;
		while((len=fis.read(b))!=-1) {
			os.write(b,0,len);
		}
		s.shutdownOutput();
		byte[] bb=new byte[1024];
		int lenn;
		while((lenn=is.read(bb))!=-1) {
			System.out.println(new String(bb,0,lenn));
		}
		//bism.close();
		//bis.close();
		//bos.close();
		//fis.close();
		s.close();
		
	}
}
