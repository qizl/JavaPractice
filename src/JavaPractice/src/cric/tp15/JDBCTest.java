package cric.tp15;

import java.sql.*;
import java.util.Date;

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

            var sqlRead = "select * from users";
            resultSet = statement.executeQuery(sqlRead);
            System.out.println("数据读取成功！");
            while (resultSet.next()) {
                var id = resultSet.getInt("id");
                var name = resultSet.getString("name");
                var date = resultSet.getDate("createtime");
                System.out.println("Id:" + id + ",Name:" + name + ",CreateTime:" + date);
            }
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

    public void insert(String name) {
        var driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//        String userName = "sa";
//        String password = "123456";
//        String dbUri = "jdbc:microsoft:sqlserver://localhost:1433;databaseName=JDBCTest";
        var dbUri = "jdbc:sqlserver://localhost:1433;databaseName=JDBCTest;user=sa;password=123456;";
        Connection connection = null;
        Statement statement = null;
        PreparedStatement pStatement = null;
        ResultSet resultSet = null;
        try {
            Class.forName(driverName);
            System.out.println("加载驱动成功！");

//            connection = DriverManager.getConnection(dbUri, userName, password);
            connection = DriverManager.getConnection(dbUri);
            System.out.println("连接数据库成功！");

            statement = connection.createStatement();

            var sqlCreate = "insert into users(name,createtime) values(?,getDate())";
            pStatement = connection.prepareStatement(sqlCreate);
            pStatement.setString(1, name);
            pStatement.executeUpdate();
            System.out.println("数据创建成功！");

            var sqlRead = "select top 10 * from users order by createtime desc";
            resultSet = statement.executeQuery(sqlRead);
            System.out.println("数据读取成功！");
            while (resultSet.next()) {
                var id = resultSet.getInt("id");
                var name1 = resultSet.getString("name");
                var date = resultSet.getDate("createtime");
                System.out.println("Id:" + id + ",Name:" + name1 + ",CreateTime:" + date);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (pStatement != null)
                    pStatement.close();
                if (connection != null)
                    connection.close();
                System.out.println("数据库连接关闭成功！");
            } catch (Exception e) {
            }
        }
    }
}
