package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/quizapp"; // Change to your database URL
    private static final String USERNAME = "root"; // Change to your database username
    private static final String PASSWORD = "root"; // Change to your database password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}


