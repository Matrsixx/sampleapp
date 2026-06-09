package com.example.sampleapp;

import lombok.Builder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Builder
@RestController
@RequestMapping("/api/v1/")
public class Controller {

    @GetMapping("/get")
    public ResponseEntity<Response> getData(){
        return ResponseEntity.ok(
                Response.builder()
                        .userId("1")
                        .userEmail("ol@gmail.com")
                        .userName("carol")
                        .userPassword("ine")
                        .build()
        );
    }
}
