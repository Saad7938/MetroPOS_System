package org.example.util;

public class OfflineStorage {
    private static OfflineStorage instance;

    private OfflineStorage() {}

    public static OfflineStorage getInstance() {
        if (instance == null) {
            instance = new OfflineStorage();
        }
        return instance;
    }

    // Add offline storage methods
}
