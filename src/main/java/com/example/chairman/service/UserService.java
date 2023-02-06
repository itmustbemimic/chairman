package com.example.chairman.service;

import com.example.chairman.dto.UserCreateRequestDto;
import com.example.chairman.jwt.TokenInfo;

public interface UserService {
    Long create(UserCreateRequestDto requestDto);
    TokenInfo login (String userId, String password);

}
