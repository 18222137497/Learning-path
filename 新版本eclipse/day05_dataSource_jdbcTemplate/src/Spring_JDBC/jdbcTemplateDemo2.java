package Spring_JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import druid.DruidUtils;

public class jdbcTemplateDemo2 {
	public static void main(String[] args) {
		JdbcTemplate jt=new JdbcTemplate(DruidUtils.getDruidDataSource());
		//1.修改数据
		int c1 = jt.update("update account set balance = ? where id = ?",1000,1);
		System.out.println(c1);
		//2.添加数据
		int c2 = jt.update("insert into account(id , name,balance) values(3,'wangjing',1000)");
		System.out.println(c2);
		//3.删除数据
		int c3 = jt.update("delete from account where id=3");
		System.out.println(c3);
		//4.查询id为1的记录，将其封装为map集合   注意，这个方法查询的结果集只能是1
		Map<String, Object> m=new HashMap<String, Object>();
		m= jt.queryForMap("select * from account where id=1");
		System.out.println(m);
		//5.查询所有记录将其封装为List集合
		List<Map<String, Object>> list = jt.queryForList("select * from account");
		System.out.println(list);
		//6.查询所有记录，将其封装为Emp对象的List集合
		List<Emp> q = jt.query("select * from account",new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rs, int i) throws SQLException {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double balance = rs.getDouble(3);
				Emp e=new Emp(id,name,balance);
				return e;
			}
			
		});
		System.out.println(q);
		//6.1 查询所有记录，将其封装为Emp对象的List集合，这个类需要注意！！！！！！！！
		List<Emp> qq = jt.query("select * from account",new BeanPropertyRowMapper<Emp>(Emp.class));
		//调用上面这个方法，你的Emp类里必须有setget方法！！！！！！
		System.out.println(qq);
		//7.查询总记录数 ,一般用于聚合函数
		Long l = jt.queryForObject("select count(id) from account", long.class);
		System.out.println(l);
	}
}
