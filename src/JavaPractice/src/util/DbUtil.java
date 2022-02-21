package util;

import java.sql.*;

/**
 * description: add a description
 *
 * @author Qizl
 * @version 1.0.0
 * @since 2022/02/21 10:53:19
 */
public class DbUtil {
    private String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String dbUri = "jdbc:sqlserver://localhost:1433;databaseName=JDBCTest;user=sa;password=123456;";
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public DbUtil() {
        try {
            Class.forName(this.driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        if (this.connection == null || this.connection.isClosed())
            this.connection = DriverManager.getConnection(this.dbUri);
        return this.connection;
    }

    public boolean update(String sql) {
        if (sql == null || sql.length() == 0)
            return false;

        try {
            this.getConnection();
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.close();
        }
    }

    public ResultSet read(String sql) {
        if (sql == null || sql.length() == 0)
            return null;

        try {
            this.getConnection();
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery(sql);

            if (this.resultSet != null) {
                while (this.resultSet.next()) {
                    var id = this.resultSet.getInt("id");
                    var name = this.resultSet.getString("name");
                    var date = this.resultSet.getString("createtime");
                    System.out.println("Id:" + id + ",Name:" + name + ",CreateTime:" + date);
                }
            }

            return this.resultSet;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            this.close();
        }
    }

    private void close() {
        try {
            if (this.connection != null)
                this.connection.close();
            if (this.statement != null)
                this.statement.close();
            if (this.resultSet != null)
                this.resultSet.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
