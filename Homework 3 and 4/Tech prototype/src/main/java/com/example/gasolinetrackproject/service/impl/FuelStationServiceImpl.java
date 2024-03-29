package com.example.gasolinetrackproject.service.impl;

import com.example.gasolinetrackproject.model.FuelStation;
import com.example.gasolinetrackproject.repository.jpa.FuelStationRepository;
import com.example.gasolinetrackproject.service.FuelStationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuelStationServiceImpl implements FuelStationService {

    private final FuelStationRepository fuelStationRepository;

    public FuelStationServiceImpl(FuelStationRepository fuelStationRepository) {
        this.fuelStationRepository = fuelStationRepository;
    }

    @Override
    public Optional<FuelStation> save(String name, String city, String coordinate_x, String coordinate_y) {
        return Optional.of(this.fuelStationRepository.save(
                new FuelStation(name, city, coordinate_x, coordinate_y)
        ));
    }

    @Override
    public List<FuelStation> listAll() {
        return this.fuelStationRepository.findAll();
    }

    @Override
    public List<String> findDistinctByCity() {
        return this.fuelStationRepository.findDistinctByCity();
    }

    @Override
    public List<String> findDistinctByName() {
        return this.fuelStationRepository.findDistinctByName();
    }

    @Override
    public List<FuelStation> filterStations(String name, String city) {
        if (city != null && !city.equals("") && name != null && !name.equals("")){
            return this.fuelStationRepository.findAllByCityAndName(city, name);
        }else if(city != null && !city.equals("")){
            return this.fuelStationRepository.findAllByCity(city);
        }else if(name != null  && !name.equals("")){
            return this.fuelStationRepository.findAllByName(name);
        }else{
            return  this.fuelStationRepository.findAll();
        }
    }

    @Override
    public Optional<FuelStation> findById(Long id) {
        return this.fuelStationRepository.findById(id);
    }
}
