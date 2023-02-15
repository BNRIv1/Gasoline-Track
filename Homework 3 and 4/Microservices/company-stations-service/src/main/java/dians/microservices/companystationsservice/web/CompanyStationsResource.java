package dians.microservices.companystationsservice.web;

import dians.microservices.companystationsservice.models.AllGasStations;
import dians.microservices.companystationsservice.models.GasStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/companies")
public class CompanyStationsResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{companyName}")
    public List<GasStation> getCompanyStationsByName(@PathVariable String companyName){
        AllGasStations allGasStations = restTemplate.getForObject("http://stations-info-service/stations/all", AllGasStations.class);
        return allGasStations != null ?
                allGasStations.getGasStations().stream().filter(i->i.getName().equals(companyName)).collect(Collectors.toList())
                :null;
    }
    
}
