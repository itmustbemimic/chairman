package com.example.chairman.dto;

import com.example.chairman.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserCreateRequestDto {
    private String userId;
    private String password;
    private String name;
    private String nickname;
    private String phone;
    private String birth;
    private String gender;
    private String role;

    @Builder
    public UserCreateRequestDto(String userId, String password, String name, String nickname, String phone, String birth, String gender, String role) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.phone = phone;
        this.birth = birth;
        this.gender = gender;
        this.role =  role;
    }

    public User toEntity(){
        return User.builder()
                .userId(userId)
                .password(password)
                .name(name)
                .nickname(nickname)
                .phone(phone)
                .birth(birth)
                .gender(gender)
                .role(role)
                .build();
    }
}
