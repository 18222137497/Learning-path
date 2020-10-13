package cn.itcast.jdbc;

import java.util.Scanner;

public class jdbc_log {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("用户名：");
		String user=scan.next();
		System.out.print("密码：");
		String password=scan.next();
		if(JDBCUtils.login(user, password)) {
			System.out.println("登录成功");
		}else {
			System.out.println("用户名或密码错误");
		}
		
	}
}
