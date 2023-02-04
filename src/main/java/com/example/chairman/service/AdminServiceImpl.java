package com.example.chairman.service;

import com.example.chairman.domain.user.User;
import com.example.chairman.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminServiceImpl implements AdminService{
    private final UserRepository userRepository;
    @Override
    public List<User> getNPUser() {
        return userRepository.findByRole("NP");
    }
}
