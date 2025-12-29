package com.Spring.expense_tracker.controller;

import com.Spring.expense_tracker.model.User;
import com.Spring.expense_tracker.repository.AuthRepository;
import com.Spring.expense_tracker.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AuthController {
    @Autowired
    AuthService AuthService;
    @PostMapping("/register")
    public ResponseEntity<Map<String,Object>> register(User user){


    }

}
