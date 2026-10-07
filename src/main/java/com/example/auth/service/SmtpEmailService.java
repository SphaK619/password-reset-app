package com.example.auth.service;

import org.springframework.stereotype.Service;

@Service
public class SmtpEmailService implements EmailService {

    @Override
    public void sendPasswordResetEmail(String to, String resetLink) {
        System.out.println("Sending password reset email to: " + to);
        System.out.println("Reset link: " + resetLink);
    }
}
