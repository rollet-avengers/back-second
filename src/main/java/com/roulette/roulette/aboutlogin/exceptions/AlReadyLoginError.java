package com.roulette.roulette.aboutlogin.exceptions;

import io.jsonwebtoken.JwtException;

public class AlReadyLoginError extends JwtException {
    public AlReadyLoginError(String message) {
        super(message);
    }

    public AlReadyLoginError(String message, Throwable cause) {
        super(message, cause);
    }
}

