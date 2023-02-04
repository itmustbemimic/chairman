package com.example.chairman.controller;

import com.example.chairman.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;


    // repo에서 반환하는 entity를 응답값으로 반환하면 안됨.
    // 조회한 객체를 API의 응답값으로 매핑하는 로직필요
    @GetMapping("np")
    public ResponseEntity getNPUser() {
        return ResponseEntity.ok(adminService.getNPUser());
    }

    @PutMapping("permit/{uuid}")
    public ResponseEntity permitUser(@PathVariable String uuid) {
        return ResponseEntity.ok(adminService.permitUser(uuid));
    }

}
