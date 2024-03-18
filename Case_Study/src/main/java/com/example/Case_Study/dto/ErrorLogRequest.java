package com.example.Case_Study.dto;

import lombok.Data;

@Data
public class ErrorLogRequest {
    private String errorMessage;
    private String  username;

}