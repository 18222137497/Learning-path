package jdbc_LX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * ��ѯday03.emp������ݽ����װΪ����װ�ؼ��ϣ�Ȼ���ӡ
 * @author 123
 *
 */
public class jdbclx_select {
	public static void main(String[] args) {
		ArrayList<Emp> l=new ArrayList<Emp>();
			Connection con=null;
			Statement s=null;
			ResultSet r = null;
		try {
			//1.ע������
			Class.forName("com.mysql.jdbc.Driver");
			//2.����sql
			String sql="select * from emp";
			//3.��ȡ���ݿ����Ӷ���
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day03","root","root");
			//4.��ȡsql����
			s=con.createStatement();
			//5.ִ��sql
			r = s.executeQuery(sql);
			//6.������
			while (r.next()) {
				l.add(new Emp(r.getInt(1),r.getString(2),r.getString(3).toCharArray()[0],r.getDouble(4),r.getDate(5),r.getInt(6)));
			}
			for (Emp emp : l) {
				System.out.println(emp);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//7.�ͷ���Դ
			if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (s!=null) {
				try {
					s.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (r!=null) {
				try {
					r.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
