# Password Reset App

A Spring Boot Java application that demonstrates a forgotten password reset workflow.

## Features
- Request reset by email
- Generate secure reset token
- Email reset link simulation
- Validate reset token and expiry
- Update password securely using BCrypt
- H2 database for local development

## Project structure

```text
password-reset-app/
├── .gitignore
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── example/
        │           └── auth/
        │               ├── AuthApplication.java
        │               ├── config/
        │               │   └── SecurityConfig.java
        │               ├── controller/
        │               │   └── AuthController.java
        │               ├── dto/
        │               │   ├── ForgotPasswordRequest.java
        │               │   └── ResetPasswordRequest.java
        │               ├── entity/
        │               │   ├── User.java
        │               │   └── PasswordResetToken.java
        │               ├── repository/
        │               │   ├── UserRepository.java
        │               │   └── PasswordResetTokenRepository.java
        │               └── service/
        │                   ├── EmailService.java
        │                   ├── SmtpEmailService.java
        │                   └── PasswordResetService.java
        └── resources/
            ├── application.properties
            └── static/
                └── reset-password.html
```

## Run locally

```bash
mvn spring-boot:run
```

Then open:
- http://localhost:8080/reset-password.html

## Default endpoints

```http
POST /api/auth/forgot-password
POST /api/auth/reset-password
```

## Example JSON

Forgot password request:

```json
{
  "email": "user@example.com"
}
```

Reset password request:

```json
{
  "token": "some-token",
  "newPassword": "MyNewStrongPassword123!"
}
```
