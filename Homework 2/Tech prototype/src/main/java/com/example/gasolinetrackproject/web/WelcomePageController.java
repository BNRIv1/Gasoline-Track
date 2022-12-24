package com.example.gasolinetrackproject.web;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/welcome", "/"})
public class WelcomePageController {

    @GetMapping
    public String getWelcomePage(){
=======
import com.example.gasolinetrackproject.model.City;
import com.example.gasolinetrackproject.model.Company;
import com.example.gasolinetrackproject.service.CityService;
import com.example.gasolinetrackproject.service.CompanyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/welcome")
public class WelcomePageController {

    private final CityService cityService;
    private final CompanyService companyService;

    public WelcomePageController(CityService cityService, CompanyService companyService) {
        this.cityService = cityService;
        this.companyService = companyService;
    }

    @GetMapping("")
    public String getWelcomePage(@RequestParam(required = false) String error, Model model){
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
>>>>>>> master
        return "welcome";
    }
}
