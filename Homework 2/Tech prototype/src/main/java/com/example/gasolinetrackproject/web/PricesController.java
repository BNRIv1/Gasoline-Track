package com.example.gasolinetrackproject.web;

import com.example.gasolinetrackproject.model.Fuel;
import com.example.gasolinetrackproject.service.FuelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/prices")
public class PricesController {

    private final FuelService fuelService;

    public PricesController(FuelService fuelService) {
        this.fuelService = fuelService;
    }


    @GetMapping
    public String getPrices(Model model){
        model.addAttribute("fuels", this.fuelService.listAll());
        return "prices";
    }

    @PostMapping("/calculate")
    public String postPrice(@RequestParam(required = false) Double amount,
                              @RequestParam(required = false) Long fuelId,
                              @RequestParam(required = false) Double average_consumption,
                              Model model){
        if(amount == null){
            model.addAttribute("hasErrorAmount",true);
        }if(average_consumption == null){
            model.addAttribute("hasErrorConsumption",true);
        }

        if(amount != null && fuelId != null && average_consumption != null){
            Fuel fuel = this.fuelService.findById(fuelId).get();
            model.addAttribute("price", this.fuelService.calculatePrice(amount, fuel.getFuelPrice()));
            model.addAttribute("distance", this.fuelService.calculateDistance(amount, average_consumption));
        }else {
            model.addAttribute("hasError",true);
        }

        model.addAttribute("fuels", this.fuelService.listAll());
        return "prices";
    }
}
