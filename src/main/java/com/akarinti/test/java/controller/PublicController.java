package com.akarinti.test.java.controller;


import com.akarinti.test.java.service.PublicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Endpoint List:
 * - Register User
 *
 * **/

@RestController
@RequestMapping("/public")
@RequiredArgsConstructor
public class PublicController implements PublicService {

    private final PublicService publicService;

    @Override
    @PostMapping("") /**Declare your own path**/
    public ResponseEntity registerUser() {
        return publicService.registerUser();
    }
}
