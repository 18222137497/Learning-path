package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ����
 * @author 123
 *
 */
public class jdbc_shiwu {
	public static void main(String[] args) {
		Connection c=null;
		PreparedStatement p1=null;
		PreparedStatement p2=null;
		try {
			//1.��ȡ���ݿ����Ӷ���
			c =JDBCUtils.getConnection();
			//2.��������
			c.setAutoCommit(false);
			//3.����sql���
			String sql1="update account set balance = balance - ? where id = ? ";
			String sql2="update account set balance = balance + ? where id = ? ";
			//4.��ȡsqlִ�ж���
			p1=c.prepareStatement(sql1);
			p2=c.prepareStatement(sql2);
			p1.setDouble(1, 500);
			p1.setInt(2, 1);
			p2.setDouble(1, 500);
			p2.setInt(2, 2);
			//5.ִ��sql
			p1.executeUpdate();
			p2.executeUpdate();
			c.commit();//û�з��������ύ����
		} catch (Exception e) {//����Ҫ�״��쳣
			try {
				c.rollback();//������������ع�
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			JDBCUtils.close(p1, c);
			JDBCUtils.close(p1, null);
		}
		
	}
}
