package druid;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


/**
 * Druid�Ĺ�����
 * @author 123
 *
 */
public class DruidUtils {
	private static DataSource d;
	/**
	 * ��̬���������ļ�
	 */
	static {
		try {
			Properties p=new Properties();
			p.load(DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
			new DruidDataSourceFactory();
			d= DruidDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @return ��ȡ�����ݿ����Ӷ���
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return d.getConnection();
	}
	/**
	 * �ر����ķ���
	 * @param c
	 * @param s
	 * @param r
	 */
	public static void closs(Connection c,Statement s,ResultSet r) {
		if (c!=null) {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (s!=null) {
			try {
				s.close();//�黹����
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
	/**
	 * ��ȡ���ݿ����ӳصķ���
	 * @return	���ݿ����ӳض���
	 */
	public static DataSource getDruidDataSource() {
		return d;
	}
	
}
