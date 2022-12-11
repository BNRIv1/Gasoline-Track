package com.example.gasolinetrackproject.service.impl;

import com.example.gasolinetrackproject.model.Fuel;
import com.example.gasolinetrackproject.repository.impl.InMemoryFuelRepository;
import com.example.gasolinetrackproject.service.FuelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuelServiceImpl implements FuelService {

    private final InMemoryFuelRepository fuelRepository;

    public FuelServiceImpl(InMemoryFuelRepository fuelRepository) {
        this.fuelRepository = fuelRepository;
    }

    @Override
    public List<Fuel> listAll() {
        return fuelRepository.findAllFuels();
    }
}
