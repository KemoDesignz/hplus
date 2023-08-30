package com.learning.springex.springexample.controller;

import com.learning.springex.springexample.util.LoggerUtil;
import org.apache.juli.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final Log log = LoggerUtil.getLogger();


    @GetMapping("/home")
    public String goHome() {
        System.out.println("going home");
        return "index";
    }

    @GetMapping("/goToSearch")
    public String goToSearch() {
        log.info("Accessing search....");
        return "search";
    }

    @GetMapping("/goToLogin")
    public String goToLogin() {
        log.info("Accessing login....");
        return "login";
    }

    @GetMapping("/goToRegistration")
    public String goToRegistration() {
        log.info("Accessing registration....");
        return "register";
    }

}
