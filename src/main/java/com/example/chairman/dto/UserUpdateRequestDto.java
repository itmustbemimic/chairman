package com.example.chairman.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserUpdateRequestDto {
    private String role;

    @Builder
    public UserUpdateRequestDto (String role) {
        this.role = role;
    }

}
