package com.example.chairman.controller;

import com.example.chairman.dto.UserCreateRequestDto;
import com.example.chairman.dto.UserLoginRequestDto;
import com.example.chairman.jwt.TokenInfo;
import com.example.chairman.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("test")
    public String helloWorld() {
        return "hello world";
    }

    @PostMapping("join")
    public Long create(@RequestBody UserCreateRequestDto requestDto) {
        return userService.create(requestDto);
    }

    @PostMapping("login")
    public TokenInfo login (@RequestBody UserLoginRequestDto requestDto) {
        String userId = requestDto.getUserId();
        String password = requestDto.getPassword();
        TokenInfo tokenInfo = userService.login(userId, password);

        return tokenInfo;
    }

}
