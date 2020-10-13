package 文件上传优化;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class 服务器端 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(11111);
		File f=new File("src");
		if (f.exists()) {
			f.mkdirs();
		}
		while(true){
			Thread t=new Thread(new Runnable() {
				public void run() {
					try {
						Socket s=ss.accept();
						FileOutputStream fos=new FileOutputStream(
								f+"/wj"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg");
						InputStream is=s.getInputStream();
						OutputStream os=s.getOutputStream();
						byte[] b=new byte[1024];
						int len;
						while((len=is.read(b))!=-1) {
							fos.write(b, 0, len);
						}
						os.write("上传成功".getBytes());
						s.close();
						}catch(IOException e){
							System.out.println(e);
						}
				}
			});
			t.start();
			
		}
		
	}
}
