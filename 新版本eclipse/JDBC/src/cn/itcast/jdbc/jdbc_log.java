package cn.itcast.jdbc;

import java.util.Scanner;

public class jdbc_log {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("�û�����");
		String user=scan.next();
		System.out.print("���룺");
		String password=scan.next();
		if(JDBCUtils.login(user, password)) {
			System.out.println("��¼�ɹ�");
		}else {
			System.out.println("�û������������");
		}
		
	}
}
