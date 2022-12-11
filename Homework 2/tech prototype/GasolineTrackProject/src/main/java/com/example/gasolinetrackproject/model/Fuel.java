package com.example.gasolinetrackproject.model;


import lombok.Data;

@Data
public class Fuel {

    private Long fuelId;
    private String fuelName;
    private float fuelPrice;

    public Fuel() {
    }

    public Fuel(Long fuelId, String fuelName, float fuelPrice) {
        this.fuelId = fuelId;
        this.fuelName = fuelName;
        this.fuelPrice = fuelPrice;
    }
}
