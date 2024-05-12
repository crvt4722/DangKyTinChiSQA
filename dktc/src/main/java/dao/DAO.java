package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

    public static Connection con;

    public DAO() {
        if (con == null) {
            try {
                String dbUrl = "jdbc:mysql://localhost:3306/sqa";
                String dbUser = "root";
                String dbPassword = "chuan28112002";
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
    	DAO dao = new DAO();
        if (con != null) {
            System.out.println("successful");
        } else {
            System.out.println("failed");
        }
    }
}
