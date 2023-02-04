package com.example.chairman.domain.user;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //SpringBoot 2.0 부터 auto increment 위해서 필수
    @Column(name = "_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "uuid", unique = true, nullable = false)
    private String uuid;

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


    @Builder // setter와 달리 인자로 잘못된 갑을 전달하는 문제가 없어서 빌더 클래스 사용 권장
    public User(String uuid, String userId, String password, String name, String nickname, String phone, String birth, String gender, String role) {
        this.uuid = uuid;
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.phone = phone;
        this.birth = birth;
        this.gender = gender;
        this.role = role;
    }

    public void roleUpdate() {
        this.role = "P";
    }
}
