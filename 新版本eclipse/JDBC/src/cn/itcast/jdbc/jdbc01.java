package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JBDC��������
 * @author 123
 *
 */
public class jdbc01 {
	public static void main(String[] args) throws Exception {
		//1.���������ܰ�
		//2.ע������
		Class.forName("com.mysql.jdbc.Driver");
		//3.��ȡ���ݿ�����Ӷ���
		Connection connection = DriverManager.getConnection("jdbc01:mysql://localhost:3306/day04","root","root");
		//4.����һ��sql���
		String sql="update account set balance = 500 where id=2";
		//5.��ȡִ��sql���� Statement
		Statement stmt = connection.createStatement();
		//6.ִ��sql
		int count = stmt.executeUpdate(sql);
		//7.������
		System.out.println(count);
		//�ͷ���Դ
		stmt.close();
		connection.close();
	}
}
