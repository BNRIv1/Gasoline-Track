package dians.microservices.stationsinfoservice.web;

import dians.microservices.stationsinfoservice.models.AllGasStations;
import dians.microservices.stationsinfoservice.models.GasStation;
import dians.microservices.stationsinfoservice.models.exceptions.StationNotFoundException;
import dians.microservices.stationsinfoservice.service.GasStationService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stations")
public class StationResource {

    private final GasStationService gasStationService;

    public StationResource(GasStationService gasStationService) {
        this.gasStationService = gasStationService;
    }

    @RequestMapping("/all")
    public AllGasStations getAllStations(){
        AllGasStations allGasStations = new AllGasStations();
        allGasStations.setGasStations(this.gasStationService.findAll());
        return allGasStations;
    }

    @RequestMapping("/{stationId}")
    public GasStation getStationInfo(@PathVariable Long stationId){
        return this.gasStationService.findById(stationId).orElseThrow(StationNotFoundException::new);
    }

}
