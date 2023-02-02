package com.example.chairman.service;

import com.example.chairman.domain.user.UserRepository;
import com.example.chairman.dto.UserCreateRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public Long create(UserCreateRequestDto requestDto) {

        return userRepository.save(requestDto.toEntity(passwordEncoder)).getId();

    }
}
