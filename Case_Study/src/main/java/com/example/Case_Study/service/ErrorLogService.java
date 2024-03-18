package com.example.Case_Study.service;

import com.example.Case_Study.model.ErrorLog;
import com.example.Case_Study.repo.ErrorLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ErrorLogService {

    @Autowired
    private ErrorLogRepository errorLogRepository;

    @Autowired
    UserService userService;

    public void logError(String errorMessage, Long userId) {
        ErrorLog errorLog = new ErrorLog();
        errorLog.setErrorMessage(errorMessage);
        errorLog.setUserId(userId);
        errorLog.setTimestamp(new Date());
        errorLogRepository.save(errorLog);

        // Add logic here to communicate with the ticket management system
        // For example:
        // ticketManagementSystem.createTicket(errorMessage, userId, errorLog.getTimestamp());
    }
}