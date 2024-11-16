package org.example.view;

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JFrame {
    private JProgressBar progressBar;
    private JLabel logoLabel;

    public SplashScreen() {
        setUndecorated(true);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Logo
        logoLabel = new JLabel("Metro POS");
        logoLabel.setFont(new Font("Arial", Font.BOLD, 24));
        logoLabel.setHorizontalAlignment(JLabel.CENTER);

        // Progress Bar
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        add(logoLabel, BorderLayout.CENTER);
        add(progressBar, BorderLayout.SOUTH);

        startLoading();
    }

    private void startLoading() {
        Timer timer = new Timer(50, e -> {
            int value = progressBar.getValue();
            if (value < 100) {
                progressBar.setValue(value + 2);
            } else {
                ((Timer) e.getSource()).stop();
                openLoginScreen();
            }
        });
        timer.start();
    }

    private void openLoginScreen() {
        SwingUtilities.invokeLater(() -> {
            new LoginView().setVisible(true);
            dispose();
        });
    }
}