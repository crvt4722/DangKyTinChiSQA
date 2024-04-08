package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/sqa?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "toilaSong";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
