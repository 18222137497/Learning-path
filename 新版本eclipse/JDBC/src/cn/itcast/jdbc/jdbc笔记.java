package cn.itcast.jdbc;
/**
 * JDBC�����������
 * @author 123
 *
 */
public class jdbc�ʼ� {
	/*
	 * DriverManager:�����������
	 *  ����:
	 *   1.ע������:���߳����ʹ���Ǹ����ݿ�������jar��    ������
	 *   static void registerDriver(Driver driver) :ע����������������� DriverManager��
	 *   д����ʹ��:Class.forName("com.mysql.jdbc.Driver");
	 *   ͨ���鿴Դ�뷢��:��com.mysql.jdbc.Driver���д��ھ�̬�����
	 *    static {try {
	 *		java.sql.DriverManager.registerDriver(new Driver());
	 *		} catch (SQLException E) {
	 *		throw new RuntimeException("Can't register driver!");}}
	 *	     ע��:mysql5֮�������jar������ʡ��ע����������
	 *   2.��ȡ���ݿ�����:
	 *     ������static Connection getConnection(String url, String user, String password) 
	 *     ������
	 *			url��ָ�����ӵ�·��
	 *			�﷨��jdbc:mysql://ip��ַ(����):�˿ں�/���ݿ�����
	 *			���ӣ�jdbc:mysql://localhost:3306/db3
	 *			ϸ�ڣ�������ӵ��Ǳ���mysql������������mysql����Ĭ�϶˿���3306����url���Լ�дΪ��jdbc:mysql:///���ݿ�����
	 *			user���û���
	 *			password������ 
	 */
	/*
	 * Connection:���ݿ����Ӷ���
	 * 	1.����:
	 * 		1.��ȡִ��sql�Ķ���
	 * 		 Statement createStatement()
	 * 		 PreparedStatement  preparedStatement(String sql)
	 * 		2.�������
	 * 		 ��������:setAutoCommit(boolean autoCommit):���ø÷������ò���Ϊfalse������������
	 * 		 �ύ����:commit();
	 * 		 �ع�����:rollback();
	 */
	/*
	 * Statement:ִ��sql����
	 * 		1.ִ��sql
	 * 		 1.boolean execute(String sql):����ִ�������sql
	 * 		 2.int executeUpdate(String sql):ִ��DML(insert,update,delete)��䡢DDL(create,alter,drop)���
	 * 			*����ֵ:Ӱ�������������ͨ�����Ӱ��������ж�DML����Ƿ�ִ�гɹ� ����ֵ>0ִ�гɹ� ��֮��ʧ��
	 * 		 3.ResultSet executeQuery(String sql):ִ��DQL(select)���
	 */
	/*
	 * ResultSet:���������
	 */
	/*
	 * PreparedStatement:ִ��Ԥ����sql����
	 */
}
