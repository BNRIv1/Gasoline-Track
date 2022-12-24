package com.example.gasolinetrackproject.model;

import lombok.Data;
import javax.persistence.*;

@Data
//@Entity
public class City {

    //@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "cityId")
    private Long cityId;

    private String cityName;

    public City() {
    }

    public City(Long cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }
}
