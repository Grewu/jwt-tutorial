package com.example.jwt.tutorial.data.response;

import lombok.Builder;

@Builder
public record AuthenticationResponse(String token) {
}
