package com.example.gasolinetrackproject.service;

import com.example.gasolinetrackproject.model.Fuel;

import java.util.List;
import java.util.Optional;

public interface FuelService {

    List<Fuel> listAll();
    Optional<Fuel> findById(Long id);
    Double calculatePrice(Double amount, float fuelPrice);
    Double calculateDistance(Double amount, Double average_consumption);
}
