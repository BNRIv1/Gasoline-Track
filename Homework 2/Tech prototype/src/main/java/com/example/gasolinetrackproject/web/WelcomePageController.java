package com.example.gasolinetrackproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/welcome", "/"})
public class WelcomePageController {

    @GetMapping
    public String getWelcomePage(){
        return "welcome";
    }
}
