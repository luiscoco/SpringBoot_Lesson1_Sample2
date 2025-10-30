package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    public String getMessage() {
        return "Hello, world!";
    }
}
