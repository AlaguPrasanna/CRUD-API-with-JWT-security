package com.VehicleManagement.Vehicle.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/admin")
@RequiredArgsConstructor
public class AdminController {

    @GetMapping
//    @PreAuthorize("Admin")
    public ResponseEntity<String> sayHello()
    {
        return ResponseEntity.ok("Hi Admin");
    }

//    @GetMapping("/student")
//    @PreAuthorize("Student")
//    public ResponseEntity<String> sayHelloForStudent()
//    {
//        return ResponseEntity.ok("Hi Student");
//    }
}
