package com.example.spring_boot_with_react.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class start {
    @GetMapping("/start")
    public String starter(){
        String s = "This is the new spring react project";
        return s;
    }
}
