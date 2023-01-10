package com.solvd.building.connectionPool;

import java.sql.Connection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {

    private BlockingQueue<Connection> pool;
    private int maxSize;
    private int currentSize;

    public ConnectionPool(int initialSize, int maxSize) {
        pool = new LinkedBlockingQueue<>();
        this.maxSize = maxSize;
        currentSize = initialSize;
        for (int i = 0; i < initialSize; i++) {
            Connection connection = createConnection();
            pool.offer(connection);
        }
    }

    public Connection getConnection() throws InterruptedException {
        if (pool.isEmpty() && currentSize < maxSize) {
            addConnections(1);
        }
        return pool.take();
    }

    public void releaseConnection(Connection connection) throws InterruptedException {
        pool.put(connection);
    }

    public synchronized void addConnections(int numConnections) {
        if (currentSize + numConnections > maxSize) {
            numConnections = maxSize - currentSize;
        }
        for (int i = 0; i < numConnections; i++) {
            Connection connection = createConnection();
            pool.offer(connection);
        }
        currentSize += numConnections;
    }

    private Connection createConnection() {
        return null;
    }
}
