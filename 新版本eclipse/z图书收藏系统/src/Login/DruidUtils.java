package Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;


/**
 * Druid���ݿ����ӳع�����
 * @author 123
 *
 */
public abstract class DruidUtils {
	private static DataSource d;
	static {
		try {
			Properties p=new Properties();
			p.load(DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
			new com.alibaba.druid.pool.DruidDataSourceFactory();
			d = com.alibaba.druid.pool.DruidDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * �����ݿ����ӳ����ȡ���ݿ����Ӷ���
	 * @return ���ݿ����Ӷ���
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return d.getConnection();
	}
	/**
	 * ��ȡ���ݿ����ӳ�
	 * @return ���ݿ����ӳ�
	 */
	public static DataSource getDataSource() {
		return d;
	}
	
	/**
	 * �ͷ���Դ�ķ���
	 * @param c ���ݿ����Ӷ���
	 * @param s ���ݿ�ִ�ж���
	 * @param r	�����
	 */
	public static void cloes(Connection c,Statement s,ResultSet r)  {
		if (c!=null) {
			try {
				c.close();
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
	abstract void bookSelect();//��ѯͼ����鼮
    abstract void userSelect(int i);//��ѯ�û��ղ��鼮
	abstract void addUserBook();//���û��ղؼ�����һ����
	abstract void subUserBook();//���û��ղؼ�ɾ��һ����
	abstract void alterUserPassword();//�޸�����
	abstract void createUser();//�����û�
	abstract void loginUser();//�û���¼
	abstract void updateUserName();//�޸��û�����
}