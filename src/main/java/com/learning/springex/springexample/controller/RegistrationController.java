package com.learning.springex.springexample.controller;

import com.learning.springex.springexample.beans.User;
import com.learning.springex.springexample.util.LoggerUtil;
import com.learning.springex.springexample.repository.UserRepository;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    private final Log log = LoggerUtil.getLogger();

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("newUser") User user, Model model) {
        log.info("registering new user");
        userRepository.save(user);
        model.addAttribute("dataSaved", "user registered successfully");
        return "login";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        log.info("converting string date to Pojo");
        binder.registerCustomEditor(Date.class,"date_of_birth" , new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
}
