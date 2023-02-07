package com.solvd.building.connectionPool;

import java.sql.Connection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {
    private static ConnectionPool instance;
    private static final Object lock = new Object();
    private static volatile boolean initialized = false;
    private BlockingQueue<Connection> connections;

    private ConnectionPool connectionPool;

    private void ConnectionPool() {}

    private ConnectionPool() {
        // Initialize the connection queue
        connections = new LinkedBlockingQueue<>();
    }

    public static ConnectionPool getInstance() {
        if (!initialized) {
            synchronized (lock) {
                if (!initialized) {
                    instance = new ConnectionPool();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    public Connection getConnection() throws InterruptedException {
        // Code to return a connection from the pool
        // If no connection is available, wait until one becomes available
        return connections.take();
    }

    public void releaseConnection(Connection connection) {
        // Code to release a connection back to the pool
        connections.offer(connection);
    }

    public void addConnection(Connection connection) {
        // Code to add a new connection to the pool
        connections.offer(connection);
    }

    private Connection createConnection() {
        // Code to create a new connection
        return null;
    }
}
