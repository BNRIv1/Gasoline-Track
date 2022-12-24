package com.example.gasolinetrackproject.web;

<<<<<<< HEAD
import com.example.gasolinetrackproject.model.FuelStation;
import com.example.gasolinetrackproject.model.exceptions.StationDoesNotExistException;
import com.example.gasolinetrackproject.service.FuelStationService;
=======
import com.example.gasolinetrackproject.model.City;
import com.example.gasolinetrackproject.model.Company;
import com.example.gasolinetrackproject.service.CityService;
import com.example.gasolinetrackproject.service.CompanyService;
>>>>>>> master
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> master
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomePageController {

<<<<<<< HEAD
    private final FuelStationService fuelStationService;

    public HomePageController(FuelStationService fuelStationService) {
        this.fuelStationService = fuelStationService;
    }

    @GetMapping()
    public String getHomePage(@RequestParam(required = false) String city,
                              @RequestParam(required = false) String company,
                              Model model) {

        List<FuelStation> fuelStations;
        List<FuelStation> fuelStationsMap;
        if (city != null && !city.equals("") && company != null && !company.equals("")){
            fuelStations = this.fuelStationService.findAllByCityAndName(city, company);
        }else if(city != null && !city.equals("")){
            fuelStations = this.fuelStationService.findAllByCity(city);
        }else if(company != null  && !company.equals("")){
            fuelStations = this.fuelStationService.findAllByName(company);
        }else{
            fuelStations = this.fuelStationService.listAll();
        }
        fuelStationsMap = fuelStations;
        model.addAttribute("fuelStations", fuelStations);
        model.addAttribute("fuelStationsMap", fuelStationsMap);
        model.addAttribute("selectedCity", city);
        model.addAttribute("selectedCompany", company);
        model.addAttribute("cities", this.fuelStationService.findDistinctByCity());
        model.addAttribute("companies", this.fuelStationService.findDistinctByName());
        return "home";
    }

    @GetMapping
    @RequestMapping("/station")
    public String getStation(@RequestParam(required = false) Long stationId,
                             @RequestParam(required = false) String city,
                             @RequestParam(required = false) String company,
                             Model model){
        if(stationId == null){
            return "redirect:/home";
        }else{
            FuelStation station = this.fuelStationService.findById(stationId).orElseThrow(
                    ()-> new StationDoesNotExistException(stationId)
            );
            List<FuelStation> fuelStations;
            List<FuelStation> fuelStationsMap = new ArrayList<>();
            fuelStationsMap.add(station);

            if (city != null && !city.equals("") && company != null && !company.equals("")){
                fuelStations = this.fuelStationService.findAllByCityAndName(city, company);
            }else if(city != null && !city.equals("")){
                fuelStations = this.fuelStationService.findAllByCity(city);
            }else if(company != null  && !company.equals("")){
                fuelStations = this.fuelStationService.findAllByName(company);
            }else{
                fuelStations = this.fuelStationService.listAll();
            }

            model.addAttribute("selectedStation", station);
            model.addAttribute("cities", this.fuelStationService.findDistinctByCity());
            model.addAttribute("companies", this.fuelStationService.findDistinctByName());
            model.addAttribute("selectedCity", city);
            model.addAttribute("selectedCompany", company);
            model.addAttribute("fuelStations", fuelStations);
            model.addAttribute("fuelStationsMap", fuelStationsMap);
            return "home";
        }

    }
=======
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
>>>>>>> master
}
