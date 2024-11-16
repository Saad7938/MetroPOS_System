package org.example.util;

import java.sql.Connection;

public class ConnectionManager {
    private static ConnectionManager instance;

    private ConnectionManager() {}

    public static ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    public Connection getConnection() {
        // Implement database connection logic
        return null;
    }
}
