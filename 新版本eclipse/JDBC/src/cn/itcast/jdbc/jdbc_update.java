package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * ��ϰ: account�� �޸�һ����¼ update
 * @author 123
 *
 */
public class jdbc_update {
	public static void main(String[] args) {
		Connection con = null;
		Statement se = null;
		try {
			//1.ע������
			Class.forName("com.mysql.jdbc.Driver");
			//2.����sql
			String sql="update account set balance=1000 where id=2";
			//3.��ȡConnection(���ݿ����Ӷ���)����
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day04", "root", "root");
			//4.��ȡsql����
			se = con.createStatement();
			//5.ִ��sql
			int ex = se.executeUpdate(sql);
			//6.����ṹ
			System.out.println(ex);
			if (ex>0) {
				System.out.println("ִ�гɹ�");
			}else {
				System.out.println("ִ��ʧ��");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			//7.�ͷ���Դ
			if (se!=null) {
				try {
					se.close();
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
