package com.saireddy.jwtTeluskoYt.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    @GetMapping("/")
    public String  greet(HttpServletRequest request){
        return "welcome for csrf token visit /csrf and your session id "+request.getSession().getId();
    }

    @GetMapping("/csrf")
    public CsrfToken csrfToken(HttpServletRequest request){
        return  (CsrfToken)  request.getAttribute("_csrf");
    }

}
