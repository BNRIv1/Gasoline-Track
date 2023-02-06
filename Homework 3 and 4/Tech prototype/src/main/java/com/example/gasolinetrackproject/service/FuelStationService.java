package com.example.gasolinetrackproject.service;

import com.example.gasolinetrackproject.model.FuelStation;

import java.util.List;
import java.util.Optional;

public interface FuelStationService {

    Optional<FuelStation> save(String name, String city, String coordinate_x, String coordinate_y);
    List<FuelStation> listAll();

    /**
     *
     * @return list of all cities in which there is a gas station
     */
    List<String> findDistinctByCity();

    /**
     *
     * @return list of unique gas station names
     */
    List<String> findDistinctByName();

    /**
     *
     * @param name to be filtered by
     * @param city to be filtered by
     * @return list of all stations whose name equals param name and city equals param city
     */
    List<FuelStation> filterStations(String name, String city);

    Optional<FuelStation> findById(Long id);
}