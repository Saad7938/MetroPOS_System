package org.example.config;

public class DatabaseConfig {
    private static final String URL = "jdbc:mysql://localhost:3306/metropos";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static String getUrl() { return URL; }
    public static String getUsername() { return USERNAME; }
    public static String getPassword() { return PASSWORD; }
}
