import oracle.jdbc.driver.OracleTypes;
import org.junit.Test;

import java.sql.*;

public class test {
    @Test
    public void javaCallOracle() throws Exception {
        //加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //获得连接对象
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "itheima", "itheima");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from person");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int anInt = resultSet.getInt("pid");
            String string = resultSet.getString("pname");
            String string1 = resultSet.getString("sex");
            System.out.println(anInt+" "+string+" "+string1);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
    /**
     * java调用存储过程
     * {?= call <procedure-name>[(<arg1>,<arg2>, ...)]}   调用存储函数使用
     *  {call <procedure-name>[(<arg1>,<arg2>, ...)]}   调用存储过程使用
     * @throws Exception
     */
    @Test
    public void javaCallProcedure() throws Exception {
        //加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //获得连接对象
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "itheima", "itheima");
        CallableStatement callableStatement = connection.prepareCall("{call p_yearsal(?, ?)}");
        //得到预编译的Statement对象
        CallableStatement pstm = connection.prepareCall("{call p_yearsal(?, ?)}");
        //给参数赋值
        pstm.setObject(1, 7788);
        pstm.registerOutParameter(2, OracleTypes.NUMBER);
        //执行数据库查询操作
        pstm.execute();
        //输出结果[第二个参数]
        System.out.println(pstm.getObject(2));
        //释放资源
        pstm.close();
        connection.close();
    }
    /**
     * java调用存储函数
     * {?= call <procedure-name>[(<arg1>,<arg2>, ...)]}   调用存储函数使用
     *  {call <procedure-name>[(<arg1>,<arg2>, ...)]}   调用存储过程使用
     * @throws Exception
     */
    @Test
    public void javaCallFunction() throws Exception {
        //加载数据库驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //得到Connection连接
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "itheima", "itheima");
        //得到预编译的Statement对象
        CallableStatement pstm = connection.prepareCall("{?= call f_yearsal(?)}");
        //给参数赋值
        pstm.setObject(2, 7788);
        pstm.registerOutParameter(1, OracleTypes.NUMBER);
        //执行数据库查询操作
        pstm.execute();
        //输出结果[第一个参数]
        System.out.println(pstm.getObject(1));
        //释放资源
        pstm.close();
        connection.close();
    }
}
