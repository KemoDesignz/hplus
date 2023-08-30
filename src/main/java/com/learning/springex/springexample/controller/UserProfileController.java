package com.learning.springex.springexample.controller;

import com.learning.springex.springexample.beans.Login;
import com.learning.springex.springexample.util.LoggerUtil;
import org.apache.juli.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class UserProfileController {
    private Log log = LoggerUtil.getLogger();
    @PostMapping("/userprofile")
    public String getUserProfile(@SessionAttribute("login") Login login, Model model) {
        log.info("in userProfile controller");
        model.addAttribute("username", login.getUsername());
        return "profile";
    }
}
