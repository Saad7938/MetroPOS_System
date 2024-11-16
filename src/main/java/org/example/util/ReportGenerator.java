package org.example.util;

public class ReportGenerator {
    private static ReportGenerator instance;

    private ReportGenerator() {}

    public static ReportGenerator getInstance() {
        if (instance == null) {
            instance = new ReportGenerator();
        }
        return instance;
    }

    // Add report generation methods
}
