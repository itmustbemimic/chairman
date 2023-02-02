package com.example.chairman.controller;

import com.example.chairman.dto.UserCreateRequestDto;
import com.example.chairman.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/join")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public String helloWorld() {
        return "hello world";
    }

    @PostMapping("/")
    public Long create(@RequestBody UserCreateRequestDto requestDto) {
        return userService.create(requestDto);
    }

}
