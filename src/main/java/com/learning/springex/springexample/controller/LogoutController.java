package com.learning.springex.springexample.controller;

import com.learning.springex.springexample.util.LoggerUtil;
import org.apache.juli.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    private Log log = LoggerUtil.getLogger();
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        log.info(" user session has ended");
        return "index";
    }
}
