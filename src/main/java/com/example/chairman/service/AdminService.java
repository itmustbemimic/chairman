package com.example.chairman.service;

import com.example.chairman.domain.user.User;

import java.util.List;

public interface AdminService {
    List<User> getNPUser();
    User permitUser(String uuid);
}
