package com.akarinti.test.java.controller;


import com.akarinti.test.java.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Endpoint List:
 * - Deposit Balance
 * - Payment
 *
 * **/

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class TransactionController implements TransactionService {

    private final TransactionService transactionService;

    @Override
    @PostMapping("") /**Declare your own path**/
    public ResponseEntity depositBalance() {
        return transactionService.depositBalance();
    }

    @Override
    @PostMapping("") /**Declare your own path**/
    public ResponseEntity payment() {
        return transactionService.payment();
    }

    @Override
    @GetMapping("") /**Declare your own path**/
    public ResponseEntity getBalance() {
        return transactionService.getBalance();
    }
}
