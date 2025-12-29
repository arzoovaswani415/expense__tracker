package com.Spring.expense_tracker.service;

import com.Spring.expense_tracker.model.User;
import com.Spring.expense_tracker.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    AuthRepository AuthRepository;
    public void register(User user){
        //check validity of email
        //check if email && username alr exists --> findByEmail //returns u object or null no boolean
        //hash password
        //if all passed then all call the repository register

    }

}
