package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    class WebController {
        @GetMapping("/")
        public String home() {
            return "<h1>Welcome to the Spring Boot Web Server!</h1>";
        }

        @PostMapping("/post")
        public String postData(@RequestBody String data) {
            return "Received: " + data;
        }
    }
}
