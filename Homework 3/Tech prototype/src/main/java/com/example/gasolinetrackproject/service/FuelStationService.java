package com.example.gasolinetrackproject.service;

import com.example.gasolinetrackproject.model.FuelStation;

import java.util.List;
import java.util.Optional;

public interface FuelStationService {

    Optional<FuelStation> save(String name, String city, String coordinate_x, String coordinate_y);
    List<FuelStation> listAll();
    List<String> findDistinctByCity();

    List<String> findDistinctByName();

    List<FuelStation> filterStations(String name, String city);

    Optional<FuelStation> findById(Long id);
}