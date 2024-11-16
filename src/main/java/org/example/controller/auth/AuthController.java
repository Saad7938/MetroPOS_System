package org.example.controller.auth;

import org.example.model.user.User;
import org.example.service.auth.AuthService;

public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    public boolean login(String username, String password) {
        return authService.login(username, password);
    }

    public boolean isFirstLogin(User user) {
        return authService.isFirstLogin(user);
    }

    public boolean changePassword(User user, String newPassword) {
        return authService.changePassword(user, newPassword);
    }
}