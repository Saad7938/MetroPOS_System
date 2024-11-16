package org.example.config;

public class SecurityConfig {
    private static final String SECRET_KEY = "your-secret-key";
    private static final int TOKEN_VALIDITY = 3600; // 1 hour

    public static String getSecretKey() { return SECRET_KEY; }
    public static int getTokenValidity() { return TOKEN_VALIDITY; }
}
