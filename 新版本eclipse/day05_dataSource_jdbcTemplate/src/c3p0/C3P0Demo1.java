package c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * c3p0��ʾ
 * @author 123
 *
 */
public class C3P0Demo1 {
	public static void main(String[] args) throws SQLException {
		/*
		 * 1.����(����) c3p0-0.9.5.2.jar mchange-commons-java-0.2.12.jar ��
		 *��Ҫ���ǵ������ݿ�����jar��
		 */
		/*
		 * 2.���������ļ�
		 * ���ƣ� c3p0.properties ���� c3p0-config.xml
		 * ·����ֱ�ӽ��ļ�����srcĿ¼�¼��ɡ�
		 */
		//3.�������ݿ����ӳض���
		DataSource ds=new ComboPooledDataSource();//������Դ�������String���ʹ�����named-config name="otherc3p0"
		//4.��ȡ���Ӷ���
		Connection con = ds.getConnection();
		System.out.println(con);
		
	}
}
