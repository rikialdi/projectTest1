package com.akarinti.test.java.service.impl;

import com.akarinti.test.java.service.PublicService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PublicServiceImpl implements PublicService {

    @Override
    public ResponseEntity registerUser() {
        /**
         * bussines logic for register user
         * **/
        return null;
    }
}
