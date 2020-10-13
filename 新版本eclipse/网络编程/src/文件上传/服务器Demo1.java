package 文件上传;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class 服务器Demo1 {
	public static void main(String[] args) throws IOException {
		File f=new File("src");
		ServerSocket ss=new ServerSocket(9999);
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		if (!f.exists()) {//测试此抽象路径名表示的文件或目录是否存在。
			f.mkdirs();//创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
		}
		FileOutputStream fos=new FileOutputStream(f+"/1.jpg");
		int len;
		byte[] b=new byte[1024];
		while((len=is.read(b))!=-1) {
			fos.write(b,0,len);
		}
		OutputStream os=s.getOutputStream();
		os.write("上传成功".getBytes());
		s.close();
		ss.close();
		
	}
}
