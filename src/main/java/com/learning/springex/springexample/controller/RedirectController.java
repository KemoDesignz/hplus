package com.learning.springex.springexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

    @GetMapping("/redirect")
    public String redirectLinkedin() {
        return "redirect:http://www.linkedin.com";
    }
}
