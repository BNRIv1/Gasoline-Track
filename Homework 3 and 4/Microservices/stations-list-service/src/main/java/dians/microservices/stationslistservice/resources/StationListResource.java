package dians.microservices.stationslistservice.resources;

import dians.microservices.stationslistservice.models.AllGasStations;
import dians.microservices.stationslistservice.models.GasStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/list")
public class StationListResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{city}")
    public List<GasStation> getList(@PathVariable String city){

        AllGasStations allGasStations = restTemplate.getForObject("http://stations-info-service/stations/all", AllGasStations.class);
        return allGasStations.getGasStations().stream().filter(gasStation -> gasStation.getCity().equals(city)).collect(Collectors.toList());

    }

}
