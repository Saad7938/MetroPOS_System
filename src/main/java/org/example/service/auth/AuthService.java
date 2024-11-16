package org.example.service.auth;

import org.example.model.user.User;
import org.example.repository.user.UserRepository;

public class AuthService {
    private final UserRepository userRepository;

    public AuthService() {
        this.userRepository = new UserRepository();
    }

    public boolean login(String username, String password) {
//        User user = userRepository.findByUsername(username);
//        if (user != null) {
//            return user.getPassword().equals(password);
//        }
       return false;

    }

    public boolean isFirstLogin(User user) {
        return user.getPassword().equals("Password_123");
    }

    public boolean changePassword(User user, String newPassword) {
        user.setPassword(newPassword);
        return userRepository.save(user) != null;
    }
}
