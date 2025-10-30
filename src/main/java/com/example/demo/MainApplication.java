package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            MessageService service = context.getBean(MessageService.class);
            System.out.println(service.getMessage());
        }
    }
}
