package dians.microservices.stationsinfoservice.service;

import dians.microservices.stationsinfoservice.models.GasStation;

import java.util.List;
import java.util.Optional;

public interface GasStationService {

    Optional<GasStation> findById(Long id);
    List<GasStation> findAll();

}
