package com.example.gasolinetrackproject.web;

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
@RequestMapping("/home")
public class HomePageController {

    private final CityService cityService;
    private final CompanyService companyService;

    public HomePageController(CityService cityService, CompanyService companyService) {
        this.cityService = cityService;
        this.companyService = companyService;
    }

    @GetMapping("")
    public String getHomePage(@RequestParam(required = false) String error, Model model) {
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        List<City> cities = this.cityService.listAll();
        List<Company> companies = this.companyService.listAll();
        model.addAttribute("cities", cities);
        model.addAttribute("companies", companies);
        return "home";
    }
}
