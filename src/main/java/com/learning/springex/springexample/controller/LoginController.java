package com.learning.springex.springexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password)  {
        System.out.println("logging in as" + username);
        return "login";
    }
}
