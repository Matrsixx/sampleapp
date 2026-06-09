package com.example.sampleapp;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Response {
    private String userId;
    private String userName;
    private String userEmail;
    private String userPassword;
}
