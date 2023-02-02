package com.example.chairman.dto;

import com.example.chairman.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@NoArgsConstructor
public class UserCreateRequestDto {
    private String uuid;
    private String userId;
    private String password;
    private String name;
    private String nickname;
    private String phone;
    private String birth;
    private String gender;
    private String role;

    @Builder
    public UserCreateRequestDto(String uuid, String userId, String password, String name, String nickname, String phone, String birth, String gender, String role) {
        this.uuid = uuid;
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.phone = phone;
        this.birth = birth;
        this.gender = gender;
        this.role =  role;
    }

    public User toEntity(PasswordEncoder passwordEncoder) {
        return User.builder()
                .uuid(uuid)
                .userId(userId)
                .password(passwordEncoder.encode(password))
                .name(name)
                .nickname(nickname)
                .phone(phone)
                .birth(birth)
                .gender(gender)
                .role(role)
                .build();
    }
}
