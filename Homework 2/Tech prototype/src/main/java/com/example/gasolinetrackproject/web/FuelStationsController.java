package com.example.gasolinetrackproject.web;

import com.example.gasolinetrackproject.model.City;
import com.example.gasolinetrackproject.model.Company;
import com.example.gasolinetrackproject.model.Fuel;
import com.example.gasolinetrackproject.service.CityService;
import com.example.gasolinetrackproject.service.CompanyService;
import com.example.gasolinetrackproject.service.FuelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/fuel-stations")
public class FuelStationsController {

    private final CityService cityService;
    private final CompanyService companyService;
    private final FuelService fuelService;

    public FuelStationsController(CityService cityService, CompanyService companyService, FuelService fuelService) {
        this.cityService = cityService;
        this.companyService = companyService;
        this.fuelService = fuelService;
    }

    @GetMapping("/welcome")
    public String getWelcomePage(@RequestParam(required = false) String error, Model model) {
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        return "welcome";
    }

    @GetMapping("/home")
    public String getFuelStationsPage(@RequestParam(required = false) String error, Model model) {
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

    @GetMapping("/prices")
    public String getPricesPage(@RequestParam(required = false) String error, Model model) {
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        List<Fuel> fuels = this.fuelService.listAll();
        model.addAttribute("fuels", fuels);
        return "prices";
    }
}
