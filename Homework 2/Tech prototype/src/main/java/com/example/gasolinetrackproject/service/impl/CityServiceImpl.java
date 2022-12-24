package com.example.gasolinetrackproject.service.impl;

import com.example.gasolinetrackproject.model.City;

import com.example.gasolinetrackproject.repository.impl.InMemoryCityRepository;
//import com.example.gasolinetrackproject.repository.jpa.CityRepository;
import com.example.gasolinetrackproject.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    //private final CityRepository cityRepository;
    private final InMemoryCityRepository cityRepository;

    public CityServiceImpl(InMemoryCityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> listAll() {
        return cityRepository.findAllCities();
    }
//
//    @Override
//    public List<City> listAll() {
//        return cityRepository.findAll();
//    }
}
