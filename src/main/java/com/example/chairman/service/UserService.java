package com.example.chairman.service;

import com.example.chairman.domain.user.UserRepository;
import com.example.chairman.dto.UserCreateRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public Long create(UserCreateRequestDto requestDto) {
        return userRepository.save(requestDto.toEntity()).getId();
    }
}
