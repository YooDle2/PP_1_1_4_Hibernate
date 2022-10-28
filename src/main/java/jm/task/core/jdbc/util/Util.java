package jm.task.core.jdbc.util;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/test1";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "1234";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            System.out.println("Connection ESTABLISHED");
        } catch (SQLException e) {
            System.out.println("Connection ERROR");
            e.printStackTrace();
        }
        return connection;
    }
}