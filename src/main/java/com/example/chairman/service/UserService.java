package com.example.chairman.service;

import com.example.chairman.dto.UserCreateRequestDto;

public interface UserService {
    Long create(UserCreateRequestDto requestDto);

}
