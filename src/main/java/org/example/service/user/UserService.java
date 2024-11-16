package org.example.service.user;

import org.example.model.user.User;
import org.example.repository.user.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
