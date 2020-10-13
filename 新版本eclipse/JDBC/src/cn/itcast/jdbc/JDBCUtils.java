package cn.itcast.jdbc;

import java.io.FileReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * JDBC������
 * @author 123
 *
 */
public class JDBCUtils {
	private static String url;
	private static String user;
	private static String password;
	private static String driver;
	public static boolean login(String user,String password) {
		if (user==null||password==null) {
			return false;
		}
		Connection c=null; 
		PreparedStatement p=null;//Ԥ����sql�����ĸ����Ǿ�̬sql
		ResultSet r=null;
		try{
			String sql="select * from user where username = ? and password = ?";//?��ռλ��
			//1.��ȡConnection����
			c=JDBCUtils.getConnection();
			//2.��ȡִ��sql���Ķ��� PreparedStatement
			p = c.prepareStatement(sql);
			//3.��?��ֵ
			p.setString(1, user);//����1:�ڼ����ʺ�,����2:������ʺŸ���ֵ
			p.setString(2, password);
			//4.ִ��sql
			r=p.executeQuery();
			return r.next();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtils.close(p, c, r);
		}
		return false;
	}
	/**
	 * �ļ��Ķ�ȡ��ֻ��ѽ��ȡһ�μ����õ���Щֵ��ֻ�þ�̬�����(�Ż�����̬���������౻����ʱһ������)
	 */
	static {
		try {
			//1.����Properties������
			Properties p = new Properties();
			//2.��ȡsrc·���µ��ļ��ķ�ʽ--->ClassLoader�������
			ClassLoader cl = JDBCUtils.class.getClassLoader();
			URL u = cl.getResource("jdbc.properties");//��ȡResource��Դ��URLͳһ��Դ��ʶ������λ�ļ�����·��
			String path=u.getPath();//��ȡ�ַ���·��
			p.load(new FileReader(path));//�����ļ�
			//3.��ȡ���ݣ���ֵ
			url=p.getProperty("url");
			user=p.getProperty("user");
			password=p.getProperty("password");
			driver=p.getProperty("driver");
			//4.ע������
			Class.forName(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ��ȡ���Ӷ���
	 * @return ���ݿ����Ӷ���
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,user,password);
	}
	/**
	 * �ͷ���Դ
	 * @param s	
	 * @param c
	 */
	public static void close(Statement s,Connection c) {
		if (s!=null) {
			try {
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (c!=null) {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void close(Statement s,Connection c,ResultSet r) {
		if (s!=null) {
			try {
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (c!=null) {
			try {
				c.close();
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
