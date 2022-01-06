package com.akarinti.test.java.controller;

import com.akarinti.test.java.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Endpoint List:
 * - Login
 * - Refresh Token
 *
 * **/

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController implements AuthService {

    private final AuthService authService;

    @Override
    @PostMapping("") /**Declare your own path**/
    public ResponseEntity login() {
        return authService.login();
    }

    @Override
    @PostMapping("") /**Declare your own path**/
    public ResponseEntity refreshToken() {
        return authService.refreshToken();
    }
}
