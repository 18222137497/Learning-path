package cn.itcast.jdbc;
/**
 * JDBC各个对象详解
 * @author 123
 *
 */
public class jdbc笔记 {
	/*
	 * DriverManager:驱动管理对象
	 *  功能:
	 *   1.注册驱动:告诉程序该使用那个数据库来驱动jar包    ！！！
	 *   static void registerDriver(Driver driver) :注册与给定的驱动程序 DriverManager。
	 *   写代码使用:Class.forName("com.mysql.jdbc.Driver");
	 *   通过查看源码发现:在com.mysql.jdbc.Driver类中存在静态代码块
	 *    static {try {
	 *		java.sql.DriverManager.registerDriver(new Driver());
	 *		} catch (SQLException E) {
	 *		throw new RuntimeException("Can't register driver!");}}
	 *	     注意:mysql5之后的驱动jar包可以省略注册驱动步骤
	 *   2.获取数据库连接:
	 *     方法：static Connection getConnection(String url, String user, String password) 
	 *     参数：
	 *			url：指定连接的路径
	 *			语法：jdbc:mysql://ip地址(域名):端口号/数据库名称
	 *			例子：jdbc:mysql://localhost:3306/db3
	 *			细节：如果连接的是本机mysql服务器，并且mysql服务默认端口是3306，则url可以简写为：jdbc:mysql:///数据库名称
	 *			user：用户名
	 *			password：密码 
	 */
	/*
	 * Connection:数据库连接对象
	 * 	1.功能:
	 * 		1.获取执行sql的对象
	 * 		 Statement createStatement()
	 * 		 PreparedStatement  preparedStatement(String sql)
	 * 		2.事务管理
	 * 		 开启事务:setAutoCommit(boolean autoCommit):调用该方法设置参数为false，即开启事务
	 * 		 提交事务:commit();
	 * 		 回滚事务:rollback();
	 */
	/*
	 * Statement:执行sql对象
	 * 		1.执行sql
	 * 		 1.boolean execute(String sql):可以执行任意的sql
	 * 		 2.int executeUpdate(String sql):执行DML(insert,update,delete)语句、DDL(create,alter,drop)语句
	 * 			*返回值:影响的行数，可以通过这个影响的行数判断DML语句是否执行成功 返回值>0执行成功 反之则失败
	 * 		 3.ResultSet executeQuery(String sql):执行DQL(select)语句
	 */
	/*
	 * ResultSet:结果集对象
	 */
	/*
	 * PreparedStatement:执行预编译sql对象
	 */
}
