package com.example.gasolinetrackproject.web;

import com.example.gasolinetrackproject.model.Fuel;
<<<<<<< HEAD
=======
import com.example.gasolinetrackproject.service.CityService;
import com.example.gasolinetrackproject.service.CompanyService;
>>>>>>> master
import com.example.gasolinetrackproject.service.FuelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> master
@Controller
@RequestMapping("/prices")
public class PricesController {

<<<<<<< HEAD
    private final FuelService fuelService;

    public PricesController(FuelService fuelService) {
        this.fuelService = fuelService;
    }


    @GetMapping
    public String getPrices(@RequestParam(required = false) Double amount,
                            @RequestParam(required = false) Long fuelId,
                            @RequestParam(required = false) Double average_consumption,
                            Model model){
        if (amount != null && fuelId != null && average_consumption != null){
            Fuel fuel = this.fuelService.findById(fuelId).get();
            model.addAttribute("price", this.fuelService.calculatePrice(amount, fuel.getFuelPrice()));
            model.addAttribute("distance", this.fuelService.calculateDistance(amount, average_consumption));
        }
        model.addAttribute("fuels", this.fuelService.listAll());
=======
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
>>>>>>> master
        return "prices";
    }
}
