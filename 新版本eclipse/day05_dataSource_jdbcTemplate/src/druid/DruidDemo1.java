package druid;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DruidDemo1 {
	public static void main(String[] args) throws Exception {
		//1.导入jar包
		//2.定义配置
		Properties p=new Properties();
		/*getResourceAsStream方法返回一个输入流*/
		InputStream is = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
		p.load(is);
		DataSource d=new DruidDataSourceFactory().createDataSource(p);
		Connection c = d.getConnection();
	}
}

