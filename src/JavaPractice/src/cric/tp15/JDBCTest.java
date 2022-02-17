package cric.tp15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/17 17:02:19
 */
public class JDBCTest {
    public void run() {
        var driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//        String userName = "sa";
//        String password = "123456";
//        String dbUri = "jdbc:microsoft:sqlserver://localhost:1433;databaseName=JDBCTest";
        var dbUri = "jdbc:sqlserver://localhost:1433;databaseName=JDBCTest;user=sa;password=123456;";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName(driverName);
            System.out.println("加载驱动成功！");

//            connection = DriverManager.getConnection(dbUri, userName, password);
            connection = DriverManager.getConnection(dbUri);
            System.out.println("连接数据库成功！");

            statement = connection.createStatement();

            var sqlCreate = "insert into users(name,createtime) values('zhangsan5',getdate())";
            statement.execute(sqlCreate);
            System.out.println("数据创建成功！");

            var sqlUpdate = "update users set createtime=getdate() where name='zhangsan3'";
            statement.execute(sqlUpdate);
            System.out.println("数据更新成功！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
                System.out.println("数据库连接关闭成功！");
            } catch (Exception e) {
            }
        }
    }
}
