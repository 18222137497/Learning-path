package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbclxlx {
	public static void main(String[] args) {
		Connection con =null;
		Statement s =null;
		ResultSet r =null;
		//1.ע������
		JDBCUtils j = new JDBCUtils();//ע�������Ĵ�����JDBCUtils������ľ�̬������������ʱ��һ��������
		//2.����sql
		String sql="select * from account";
		try {
		//3.��ȡ���ݿ����Ӷ���
		con = j.getConnection();
		//4.��ȡsql����
		s = con.createStatement();
		//4.ִ��sql
		r = s.executeQuery(sql);
		while (r.next()) {
			System.out.println("id="+r.getInt(1)+"	name="+r.getString(2));
		}
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			JDBCUtils.close(s, con, r);
		}
		
	}
}
