package com.example.cicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "CI/CD sistemi çalışıyor!";
    }

    @GetMapping("/version")
    public String version() {
        return "Uygulama sürümü: 1.0.0";
    }
}
