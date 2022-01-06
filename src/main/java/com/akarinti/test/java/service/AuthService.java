package com.akarinti.test.java.service;

import org.springframework.http.ResponseEntity;

public interface AuthService {

    ResponseEntity login(); /**Declare your own parameter**/
    ResponseEntity refreshToken(); /**Declare your own parameter**/
}
