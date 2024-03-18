package com.example.Case_Study.controller;

import com.example.Case_Study.dto.ErrorLogRequest;
import com.example.Case_Study.exception.UserNotFoundException;
import com.example.Case_Study.service.ErrorLogService;
import com.example.Case_Study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorLogController {

    @Autowired
    private ErrorLogService errorLogService;

    @Autowired
    UserService userService;


    @PostMapping("/error-log")
    public ResponseEntity<?> logError(@RequestBody ErrorLogRequest request) {
        try {
            Long userId = userService.findUserIdByUsername(request.getUsername());
            errorLogService.logError(request.getErrorMessage(), userId);
            return ResponseEntity.ok().build();
        } catch (UserNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
    }

}
