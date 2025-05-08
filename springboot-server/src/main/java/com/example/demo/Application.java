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
    class Homecontroller{

        // GET request handler for the home page
        @GetMapping("/")
        public String home() {
            return "<h1>Welcome to the Spring Boot Web Server!</h1>";
        }

        // POST request handler to receive data
        @PostMapping("/post")
        public String postData(@RequestBody String data) {
            return "Received data: " + data;
        }
    }
}
