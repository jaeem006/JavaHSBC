package com.example.ejemplo02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/admin")
    public String admin(){
        return "Admin!!!";
    }

    @GetMapping("/user")
    public String user(){
        return "User!!!";
    }

    @GetMapping("/all")
    public String all(){
        return "All users!!!";
    }
}
