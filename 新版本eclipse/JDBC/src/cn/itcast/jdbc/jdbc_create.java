package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_create {
	public static void main(String[] args) {
			Connection con=null;
			Statement s=null;
		try {
			//1.ע������
			Class.forName("com.mysql.jdbc.Driver");
			//2.����sql
			String sql ="create table student(id int,name varchar(20))";
			//3.��ȡConnection���ݿ����Ӷ���
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/day04","root","root");
			//4.��ȡsql���� Statement
			s=con.createStatement();
			//5.ִ��sql
			int e = s.executeUpdate(sql);
			//6.������
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//7.�ͷ���Դ
			if (s!=null) {
				try {
					s.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
