package com.example.chairman.domain.user;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "test")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //SpringBoot 2.0 부터 auto increment 위해서 필수
    @Column(name = "_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "userId", unique = true, nullable = false)
    private String userId;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nickname", unique = true, nullable = false)
    private String nickname;

    @Column(name = "phone", unique = true, nullable = false)
    private String phone;

    @Column(name = "birth")
    private String birth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "role")
    private String role;


    @Builder
    public User(String userId, String password, String name, String nickname, String phone, String birth, String gender, String role) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.phone = phone;
        this.birth = birth;
        this.gender = gender;
        this.role = role;
    }
}
