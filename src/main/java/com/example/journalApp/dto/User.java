package com.example.journalApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userName;
    private String email;
    private Boolean sentimentAnalysis;
    @NonNull
    private String password;
}
