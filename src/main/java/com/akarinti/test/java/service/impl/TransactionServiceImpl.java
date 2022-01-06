package com.akarinti.test.java.service.impl;

import com.akarinti.test.java.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Override
    public ResponseEntity depositBalance() {
        /**
         * bussines logic for deposit balance
         * **/
        return null;
    }

    @Override
    public ResponseEntity payment() {
        /**
         * bussines logic for payment
         * **/
        return null;
    }

    @Override
    public ResponseEntity getBalance() {
        /**
         * bussines logic for getBalance
         * **/
        return null;
    }
}
