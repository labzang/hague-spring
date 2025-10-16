package com.labzang.api.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @GetMapping("/auth/login.go")
    public String loginHtml() {
        return "auth/login";
    }
    @GetMapping("/auth/register.go")
    public String registerHtml() {
        return "auth/register";
    }
}
