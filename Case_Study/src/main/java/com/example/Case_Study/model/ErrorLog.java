package com.example.Case_Study.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "error_logs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "error_message", nullable = false)
    private String errorMessage;


    @Column(name = "user_id")
    private Long userId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "timestamp", nullable = false)
    private Date timestamp;


}
