package org.example.controller.user;

import org.example.model.user.User;
import org.example.service.user.UserService;

public class UserController {
    private final UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public User createUser(User user) {
        return userService.createUser(user);
    }
}
