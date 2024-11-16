package org.example.view;

import org.example.controller.auth.AuthController;
import org.example.service.auth.AuthService;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    private final AuthController authController;
    private final AuthService authService;
    private JComboBox<String> userTypeCombo;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginView() {
        authService = new AuthService();
        authController = new AuthController(authService);
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Metro POS Login");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // User Type Selection
        String[] userTypes = {"Super Admin", "Branch Manager", "Cashier", "Data Entry Operator"};
        userTypeCombo = new JComboBox<>(userTypes);

        // Username field
        usernameField = new JTextField(20);

        // Password field
        passwordField = new JPasswordField(20);

        // Login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(e -> handleLogin());

        // Add components
        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("User Type:"), gbc);

        gbc.gridx = 1;
        add(userTypeCombo, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Username:"), gbc);

        gbc.gridx = 1;
        add(usernameField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Password:"), gbc);

        gbc.gridx = 1;
        add(passwordField, gbc);

        gbc.gridx = 1; gbc.gridy = 3;
        add(loginButton, gbc);
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String userType = (String) userTypeCombo.getSelectedItem();

        if (authController.login(username, password)) {
            openDashboard(userType);
        } else {
            JOptionPane.showMessageDialog(this,
                "Invalid credentials",
                "Login Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private void openDashboard(String userType) {
       //implement
    }
}
