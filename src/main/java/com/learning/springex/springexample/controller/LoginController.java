package com.learning.springex.springexample.controller;

import com.learning.springex.springexample.beans.Login;
import com.learning.springex.springexample.beans.User;
import com.learning.springex.springexample.exceptions.ApplicationException;
import com.learning.springex.springexample.repository.UserRepository;
import com.learning.springex.springexample.util.LoggerUtil;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("login")
public class LoginController {
    @Autowired
    UserRepository userRepository;
   private final Log log = LoggerUtil.getLogger();

    @PostMapping ("/login")
    public String login(@ModelAttribute("login") Login login) {
        log.info("logging in as " + login.getUsername());
        User user = userRepository.searchByName(login.getUsername());
        if(user == null) {
            throw new ApplicationException("user was not found");
        }
        return "forward:/userprofile";
    }

}
