package c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * ���ӳز�����֤
 * @author 123
 *
 */
public class C3P0Demo2 {
	public static void main(String[] args) throws SQLException {
		DataSource ds=new ComboPooledDataSource();
		/*
		 * ��������������� �ͳ�ʱʱ��
		 */
		for (int i = 1; i < 11; i++) {
			Connection c = ds.getConnection();
			System.out.println(i+"	"+c);
			if(i==5) {
				c.close();
			}
		}
		ds.getConnection();
	}
}
