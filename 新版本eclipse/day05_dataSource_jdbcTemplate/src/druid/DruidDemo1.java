package druid;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DruidDemo1 {
	public static void main(String[] args) throws Exception {
		//1.����jar��
		//2.��������
		Properties p=new Properties();
		/*getResourceAsStream��������һ��������*/
		InputStream is = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
		p.load(is);
		DataSource d=new DruidDataSourceFactory().createDataSource(p);
		Connection c = d.getConnection();
	}
}

