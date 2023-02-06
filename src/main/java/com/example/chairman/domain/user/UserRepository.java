package com.example.chairman.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByRole(String role);
    User findByUuid(String uuid);
    Optional<User> findByUserId(String userId);
}
