package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {

    @GetMapping("/")  // Maps the root URL to this method
    public String index() {
        // This will serve index.html from the static folder or templates
        return "index";  // Returning the view name "index" (views/index.html)
    }

    @GetMapping("/about")
    public String about() {
        return "about";  // Returning the view name "about" (views/about.html)
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";  // Returning the view name "contact" (views/contact.html)
    }
}
