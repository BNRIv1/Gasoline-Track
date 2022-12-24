package com.example.gasolinetrackproject.model;

<<<<<<< HEAD
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class FuelStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    private String coordinate_x;
    private String coordinate_y;

    public FuelStation(){

    }

    public FuelStation(String name, String city, String coordinate_x, String coordinate_y){
        this.name = name;
        this.city = city;
        this.coordinate_x = coordinate_x;
        this.coordinate_y = coordinate_y;
    }

}


=======
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

>>>>>>> master
