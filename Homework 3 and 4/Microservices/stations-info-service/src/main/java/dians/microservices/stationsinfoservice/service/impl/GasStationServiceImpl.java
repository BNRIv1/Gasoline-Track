package dians.microservices.stationsinfoservice.service.impl;

import dians.microservices.stationsinfoservice.models.GasStation;
import dians.microservices.stationsinfoservice.models.exceptions.StationNotFoundException;
import dians.microservices.stationsinfoservice.repository.GasStationRepository;
import dians.microservices.stationsinfoservice.service.GasStationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GasStationServiceImpl implements GasStationService {

    private final GasStationRepository gasStationRepository;

    public GasStationServiceImpl(GasStationRepository gasStationRepository) {
        this.gasStationRepository = gasStationRepository;
    }

    @Override
    public Optional<GasStation> findById(Long id) {
        return this.gasStationRepository.findById(id);
    }

    @Override
    public List<GasStation> findAll() {
        return this.gasStationRepository.findAll();
    }
}
