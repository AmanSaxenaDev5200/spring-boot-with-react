package com.example.spring_boot_with_react.controller;

import com.example.spring_boot_with_react.model.User;
import com.example.spring_boot_with_react.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("users")
    public List<User> getusers(){
        return this.userRepo.findAll();
    }
}
