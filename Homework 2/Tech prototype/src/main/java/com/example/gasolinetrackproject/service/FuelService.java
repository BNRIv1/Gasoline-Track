package com.example.gasolinetrackproject.service;

<<<<<<< HEAD
import com.example.gasolinetrackproject.model.Fuel;

import java.util.List;
import java.util.Optional;
=======
import com.example.gasolinetrackproject.model.City;
import com.example.gasolinetrackproject.model.Fuel;

import java.util.List;
>>>>>>> master

public interface FuelService {

    List<Fuel> listAll();
<<<<<<< HEAD
    Optional<Fuel> findById(Long id);
    Double calculatePrice(Double amount, float fuelPrice);
    Double calculateDistance(Double amount, Double average_consumption);
=======
>>>>>>> master
}
