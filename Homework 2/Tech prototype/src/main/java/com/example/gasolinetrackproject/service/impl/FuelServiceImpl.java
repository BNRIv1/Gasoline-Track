package com.example.gasolinetrackproject.service.impl;

import com.example.gasolinetrackproject.model.Fuel;
import com.example.gasolinetrackproject.repository.impl.InMemoryFuelRepository;
import com.example.gasolinetrackproject.service.FuelService;
import org.springframework.stereotype.Service;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
=======
>>>>>>> master

@Service
public class FuelServiceImpl implements FuelService {

<<<<<<< HEAD
    private final InMemoryFuelRepository inMemoryFuelRepository;

    public FuelServiceImpl(InMemoryFuelRepository inMemoryFuelRepository) {
        this.inMemoryFuelRepository = inMemoryFuelRepository;
=======
    private final InMemoryFuelRepository fuelRepository;

    public FuelServiceImpl(InMemoryFuelRepository fuelRepository) {
        this.fuelRepository = fuelRepository;
>>>>>>> master
    }

    @Override
    public List<Fuel> listAll() {
<<<<<<< HEAD
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
=======
        return fuelRepository.findAllFuels();
>>>>>>> master
    }
}
