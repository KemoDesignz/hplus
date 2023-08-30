package com.learning.springex.springexample.controller;

import com.learning.springex.springexample.beans.Login;
import com.learning.springex.springexample.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class DefaultModelAttrributeController {

    @ModelAttribute("login")
    public Login getEmptyLogin() { return new Login(); }

    @ModelAttribute("newUser")
    public User getEmptyUser() {
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems() {
        return Arrays.asList(new String[] { "Male", "Female", "Other"});
    }
}
