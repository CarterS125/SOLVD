package com.solvd.building.connectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "user";
            String password = "password";

            connection = DriverManager.getConnection(jdbcUrl, username, password);
        }
        Connection connection = DBConnection.getConnection();
        return connection;
    }
}

