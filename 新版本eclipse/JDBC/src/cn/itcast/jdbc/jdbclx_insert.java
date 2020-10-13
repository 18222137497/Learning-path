package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 1.��ϰ: account�� ���һ����¼ insert
 * @author 123
 *
 */

public class jdbclx_insert {
	public static void main(String[] args) {
		Connection con=null;
		Statement cs =null;
		try {
			//1.ע������
			Class.forName("com.mysql.jdbc.Driver");
			//2.����sql
			String sql = "insert into account values(null,'wangwu',3000)";
			//3.��ȡConnection
			con = DriverManager.getConnection("jdbc:mysql:///day04", "root", "root");
			//4.��ȡִ��sql����
			cs = con.createStatement();
			//5.ִ��sql
			int ex = cs.executeUpdate(sql);
			//6.������
			System.out.println(ex);
			if (ex>0) {
				System.out.println("��ӳɹ�");
			}else {
				System.out.println("���ʧ��");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//7.�ͷ���Դ
			if (cs!=null) {
				try {
					cs.close();
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
