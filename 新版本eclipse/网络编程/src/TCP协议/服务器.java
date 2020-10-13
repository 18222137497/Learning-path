package TCP协议;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class 服务器 {
	/*
	 * TCP通信的服务器端：接收客户端的请求，读取客户端发送的数据，给客户端回写数据
	 * 表示服务器的类：
	 * 		java.net.serverSocket:此类实现服务器套接字
	 * 构造方法:
	 * 		ServerSocket(int port)创建绑定到特定端口的服务器套接字
	 * 
	 * 服务器端必须明确一件事情，必须得知道是那颗客户端请求得服务器
	 * 所以可以使用accept方法获取到请求的客户端对象Socket
	 * 成员方法：
	 * 	Socket accept()监听并接受到此套接字的连接
	 * 
	 * 服务器的实现步骤：
	 * 	1.创建服务器ServerSocket对象和系统指定的端口号
	 * 	2.使用ServerSocket对象中的房啊accept，获取到请求的客户端对象Socket
	 * 	3.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
	 * 	4.使用网络字节输入流中的方法read，读取客户端发送的数据
	 *  5.使用Socket对象中的房啊getOutputStream()获取网络字节输出流OutputStream对象
	 *  6.使用网络字节输出流的方法write，给客户端回写数据
	 *  7.释放两个资源
	 */
	public static void main(String[] args) throws IOException {
		//1.创建服务器ServerSocket对象和系统指定的端口号
		ServerSocket ss=new ServerSocket(8888);
		//2.使用ServerSocket对象中的房啊accept，获取到请求的客户端对象Socket
		Socket s=ss.accept();
		//3.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
		InputStream i=s.getInputStream();
		//4.使用网络字节输入流中的方法read，读取客户端发送的数据
		byte[] b=new byte[1024];
		int len=i.read(b);//由于内容较少所以只读一次
		System.out.println(new String(b,0,len));//接收的数据打印到控制台
		//5.使用Socket对象中的房啊getOutputStream()获取网络字节输出流OutputStream对象
		OutputStream o=s.getOutputStream();
		//6.使用网络字节输出流的方法write，给客户端回写数据
		o.write("收到谢谢".getBytes());
		//7.释放两个资源
		s.close();
		ss.close();
	}
	
}
