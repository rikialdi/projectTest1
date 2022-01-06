package com.akarinti.test.java.service.impl;

import com.akarinti.test.java.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public ResponseEntity login() {
        /**
         * bussines logic for login here
         * **/
        return null;
    }

    @Override
    public ResponseEntity refreshToken() {
        /**
         * bussines logic for refresh token
         * **/
        return null;
    }
}
