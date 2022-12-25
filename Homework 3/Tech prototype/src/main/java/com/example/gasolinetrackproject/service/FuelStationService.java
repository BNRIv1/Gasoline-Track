package com.example.gasolinetrackproject.service;

import com.example.gasolinetrackproject.model.FuelStation;

import java.util.List;
import java.util.Optional;

public interface FuelStationService {

    Optional<FuelStation> save(String name, String city, String coordinate_x, String coordinate_y);
    List<FuelStation> listAll();
    List<FuelStation> findAllByCity(String city);

    List<String> findDistinctByCity();

    List<String> findDistinctByName();

    List<FuelStation> findAllByCityAndName(String city, String name);
    List<FuelStation> findAllByName(String name);
    Optional<FuelStation> findById(Long id);
}