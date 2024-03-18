package com.example.Case_Study.controller;

import com.example.Case_Study.dto.UserRequest;
import com.example.Case_Study.model.User;
import com.example.Case_Study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody UserRequest request) {
        User user = userService.createUser(request.getUsername());
        return ResponseEntity.ok(user);
    }

}