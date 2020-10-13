package druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Druid������Ĳ�����
 * @author 123
 *
 */
public class DruidDemo2 {
	public static void main(String[] args) {
		Connection c = null;
		PreparedStatement s =null;
		ResultSet r=null;
		try {
		//1.ע������
		new DruidUtils();
		//2.����sql
		String sql = "select * from account where id=?";
		//3.��ȡ���ӳض���
		c = DruidUtils.getConnection();
		//4.��ȡִ��sql����
		s = c.prepareStatement(sql);
		s.setInt(1, 1);
		//5.ִ��sql
		r = s.executeQuery();
		while (r.next()) {
			System.out.print("id="+r.getInt(1)+"|name="+r.getString(2)+"|balance="+r.getInt(3));
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DruidUtils.closs(c, s, r);
		}
		
	}
}
