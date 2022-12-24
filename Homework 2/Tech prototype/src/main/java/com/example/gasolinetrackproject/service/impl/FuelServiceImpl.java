package com.example.gasolinetrackproject.service.impl;

import com.example.gasolinetrackproject.model.Fuel;
import com.example.gasolinetrackproject.repository.impl.InMemoryFuelRepository;
import com.example.gasolinetrackproject.service.FuelService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuelServiceImpl implements FuelService {

    private final InMemoryFuelRepository inMemoryFuelRepository;

    public FuelServiceImpl(InMemoryFuelRepository inMemoryFuelRepository) {
        this.inMemoryFuelRepository = inMemoryFuelRepository;
    }

    @Override
    public List<Fuel> listAll() {
        return this.inMemoryFuelRepository.findAllFuels();
    }

    @Override
    public Optional<Fuel> findById(Long id) {
        return this.inMemoryFuelRepository.findAllFuels().stream().filter(i->i.getFuelId().equals(id)).findFirst();
    }

    @Override
    public Double calculatePrice(Double amount, float fuelPrice) {
        return amount * fuelPrice;
    }

    @Override
    public Double calculateDistance(Double amount, Double average_consumption) {
        return (amount/average_consumption) * 100;
    }
}
