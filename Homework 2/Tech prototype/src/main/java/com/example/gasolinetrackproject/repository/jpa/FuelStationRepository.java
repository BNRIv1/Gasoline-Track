package com.example.gasolinetrackproject.repository.jpa;

import com.example.gasolinetrackproject.model.FuelStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuelStationRepository extends JpaRepository<FuelStation, Long> {

    List<FuelStation> findAllByCity(String city);
    List<FuelStation> findAllByCityAndName(String city, String name);
    List<FuelStation> findAllByName(String name);

    @Query("SELECT DISTINCT fs.city FROM FuelStation fs ORDER BY fs.city")
    List<String> findDistinctByCity();

    @Query("SELECT DISTINCT fs.name FROM FuelStation fs ORDER BY fs.name")
    List<String> findDistinctByName();


}
