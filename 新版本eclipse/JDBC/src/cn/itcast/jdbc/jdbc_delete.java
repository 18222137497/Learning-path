package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ��ϰ: account�� ɾ��һ����¼ delete
 * @author 123
 *
 */
public class jdbc_delete {
	public static void main(String[] args) {
		Connection con = null;
		Statement s =null;
		try {
		//1.ע������
			Class.forName("com.mysql.jdbc.Driver");
		//2.����sql���
			String sql="delete from account where id=3";
		//3.��ȡConnection���ݿ����Ӷ���
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day04", "root", "root");
		//4.��ȡsql����
			s = con.createStatement();
		//5.ִ��sql���
			int e = s.executeUpdate(sql);
		//6.������
			System.out.println(e);
			if (e>0) {
				System.out.println("ִ�гɹ�");
			}else {
				System.out.println("ִ��ʧ��");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
