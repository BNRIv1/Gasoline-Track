package com.example.gasolinetrackproject.model;

public class FuelStation {

    private City city;
    private Company company;
    private String fuelStationName;

    public FuelStation() {
    }

    public FuelStation(City city, Company company, String fuelStationName) {
        this.city = city;
        this.company = company;
        this.fuelStationName = fuelStationName;
    }
}

