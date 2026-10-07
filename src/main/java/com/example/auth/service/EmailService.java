package com.example.auth.service;

public interface EmailService {
    void sendPasswordResetEmail(String to, String resetLink);
}
