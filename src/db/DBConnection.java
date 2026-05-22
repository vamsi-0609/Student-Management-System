package db;

import java.sql.*;

public class DBConnection {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/organization";
    private static final String username = "root";
    private static final String password = "root";

    private Connection conn;

    public DBConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            
            System.out.println("Database Connected Successfully");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public Connection getConnection() {

        return conn;
    }
}