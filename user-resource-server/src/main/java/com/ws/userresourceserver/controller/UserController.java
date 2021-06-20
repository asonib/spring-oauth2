package com.ws.userresourceserver.controller;

import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/all-user")
    public String getUsers(){
        return "Working!!!";
    }

    @GetMapping("/all")
    public String getAll(@AuthenticationPrincipal Jwt jwt){
        return jwt.getTokenValue();
    }
}
