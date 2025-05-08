package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class Homecontroller {

    // GET request handler for the home page
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // GET request handler for the about page
    @GetMapping("/about")
    public String about() {
        return "about";
    }

    // GET request handler for the contact page
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    // POST request handler to process contact form submission
    @PostMapping("/submit")
    public String handleFormSubmit(String name, String email, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "thankyou";  // Redirect to the Thank You page after submission
    }
}
