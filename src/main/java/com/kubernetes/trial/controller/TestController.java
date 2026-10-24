package com.kubernetes.trial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("trial")
public class TestController {

    @PostMapping("/hello")
    public ResponseEntity<?> hello(){
        return  ResponseEntity.ok("hello");
    }
}
