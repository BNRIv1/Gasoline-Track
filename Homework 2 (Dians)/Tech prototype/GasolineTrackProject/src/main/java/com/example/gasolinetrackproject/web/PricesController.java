package com.example.gasolinetrackproject.web;

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
@RequestMapping("/prices")
public class PricesController {

    private final CityService cityService;
    private final CompanyService companyService;
    private final FuelService fuelService;

    public PricesController(CityService cityService, CompanyService companyService, FuelService fuelService) {
        this.cityService = cityService;
        this.companyService = companyService;
        this.fuelService = fuelService;
    }

    @GetMapping("")
    public String getPricesPage(@RequestParam(required = false) String error, Model model){
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }

        List<Fuel> fuels = this.fuelService.listAll();
        model.addAttribute("fuels", fuels);
        return "prices";
    }
}
