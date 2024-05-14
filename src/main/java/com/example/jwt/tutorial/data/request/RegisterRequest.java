package com.example.jwt.tutorial.data.request;

public record RegisterRequest(
        String firstName,
        String lastName,
        String email,
        String password) {
}
