package com.solvd.building.connectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {

    private static ConnectionPool instance;
    private Connection connection;

    private ConnectionPool() {
        // private constructor to prevent external instantiation
    }

    public static synchronized ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }

        return instance;
    }

    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "user";
            String password = "password";

            connection = DriverManager.getConnection(jdbcUrl, username, password);
        }

        return connection;
    }
}
