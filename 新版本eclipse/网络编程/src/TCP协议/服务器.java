package TCPЭ��;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ������ {
	/*
	 * TCPͨ�ŵķ������ˣ����տͻ��˵����󣬶�ȡ�ͻ��˷��͵����ݣ����ͻ��˻�д����
	 * ��ʾ���������ࣺ
	 * 		java.net.serverSocket:����ʵ�ַ������׽���
	 * ���췽��:
	 * 		ServerSocket(int port)�����󶨵��ض��˿ڵķ������׽���
	 * 
	 * �������˱�����ȷһ�����飬�����֪�����ǿſͻ�������÷�����
	 * ���Կ���ʹ��accept������ȡ������Ŀͻ��˶���Socket
	 * ��Ա������
	 * 	Socket accept()���������ܵ����׽��ֵ�����
	 * 
	 * ��������ʵ�ֲ��裺
	 * 	1.����������ServerSocket�����ϵͳָ���Ķ˿ں�
	 * 	2.ʹ��ServerSocket�����еķ���accept����ȡ������Ŀͻ��˶���Socket
	 * 	3.ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream����
	 * 	4.ʹ�������ֽ��������еķ���read����ȡ�ͻ��˷��͵�����
	 *  5.ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
	 *  6.ʹ�������ֽ�������ķ���write�����ͻ��˻�д����
	 *  7.�ͷ�������Դ
	 */
	public static void main(String[] args) throws IOException {
		//1.����������ServerSocket�����ϵͳָ���Ķ˿ں�
		ServerSocket ss=new ServerSocket(8888);
		//2.ʹ��ServerSocket�����еķ���accept����ȡ������Ŀͻ��˶���Socket
		Socket s=ss.accept();
		//3.ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream����
		InputStream i=s.getInputStream();
		//4.ʹ�������ֽ��������еķ���read����ȡ�ͻ��˷��͵�����
		byte[] b=new byte[1024];
		int len=i.read(b);//�������ݽ�������ֻ��һ��
		System.out.println(new String(b,0,len));//���յ����ݴ�ӡ������̨
		//5.ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
		OutputStream o=s.getOutputStream();
		//6.ʹ�������ֽ�������ķ���write�����ͻ��˻�д����
		o.write("�յ�лл".getBytes());
		//7.�ͷ�������Դ
		s.close();
		ss.close();
	}
	
}
