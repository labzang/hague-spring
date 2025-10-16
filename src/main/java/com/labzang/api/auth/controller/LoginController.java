package com.labzang.api.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.labzang.api.auth.domain.LoginDTO;
import com.labzang.api.auth.service.LoginService;

@Controller
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    
    @GetMapping("/auth/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        System.out.println("컨트롤러로 들어옴");
        System.out.println("화면에서 컨트롤러로 전달된 이메일 : " + email);
        System.out.println("화면에서 컨트롤러로 전달된 비밀번호 : " + password);
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setEmail(email);
        loginDTO.setPassword(password);

        loginService.login(loginDTO);


        return "auth/login";
    }
}
