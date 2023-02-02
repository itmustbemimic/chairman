package com.example.chairman.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rootController {

    @GetMapping("/")
    public String helloWorld() {
        return "hello world";
    }

}
