package com.akarinti.test.java.service;

import org.springframework.http.ResponseEntity;

public interface TransactionService {

    ResponseEntity depositBalance();/**Declare your own parameter**/
    ResponseEntity payment();/**Declare your own parameter**/
    ResponseEntity getBalance();/**Declare your own parameter**/
}
