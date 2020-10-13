package TCPЭ��;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class �ͻ���1 {
	/*
	 * TCPͨ�ŵĿͻ��ˣ�������������������󣬸��������������ݣ���ȡ��������д������
	 * 	��ʾ�ͻ��˵��ࣺ
	 * 		java.netSocket:����ʵ���˿ͻ����׽��֡��׽�������̨������ͨ�ŵĶ˵�
	 * 		�׽��֣�������IP��ַ�Ͷ˿ںŵ����絥λ
	 * 	���췽����
	 * 		Socket(String host,int port)����һ�����׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ں�
	 * 		������
	 * 			String host:����������������/��������IP��ַ
	 * 			int port���������˿ں�
	 * 	��Ա������
	 * 		OutputStream getOutputStream();���ش��׽��ֵ������
	 * 		InputStream getInputStream();���ش��׽��ֵ�������
	 * 		void closs();�رմ��׽���
	 * 	ʵ�ֲ��裺
	 * 		1.����һ���ͻ��˶���Socket�����췽����IP�Ͷ˿ں�
	 * 		2.ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
	 * 		3.ʹ�������ֽ������IutputStream�����еķ���write������������������
	 * 		4.ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream����
	 * 		5.���������ֽ�������InputStream�����еķ���read����ȡ��������д������
	 * 		6.�ͷ���Դ
	 * 	ע�⣺
	 * 		1.�ͻ��˺ͷ������˽��н���������ʹ��Socket���ṩ��������������ʹ���Լ�������������
	 * 		2.�����Ǵ����ͻ��˶���Socket��ʱ�򣬾ͻ�ȥ����������ͷ����������������ֽ�������ͨ·
	 * 		  ���������û����������ô�ͻ��׳��쳣
	 * 		 ����Ѿ���������ô�Ϳ��Խ��н�����
	 */
	public static void main(String[] args) throws IOException {
		//1.����һ���ͻ��˶���Socket�����췽����IP�Ͷ˿ں�
		Socket s=new Socket("127.0.0.1",8888);
		//2.ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
		OutputStream o=s.getOutputStream();
		//3.ʹ�������ֽ������IutputStream�����еķ���write������������������
		o.write("��÷�����".getBytes());
		//4.ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream����
		InputStream i=s.getInputStream();
		//5.���������ֽ�������InputStream�����еķ���read����ȡ��������д������
		byte[] b=new byte[1024];
		int len=i.read(b);
		System.out.println(new String(b,0,len));
		//6.�ͷ���Դ
		s.close();
	}
}
