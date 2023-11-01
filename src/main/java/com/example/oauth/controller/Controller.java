package com.example.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/public")
    public String home()
    {
        return "Welcome to home page";
    }
    @GetMapping("/secured")
    public String secured()
    {
        return "Welcome to secured page";
    }
}
