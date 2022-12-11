package com.example.gasolinetrackproject.repository.impl;

import com.example.gasolinetrackproject.model.Fuel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryFuelRepository {

    public List<Fuel> findAllFuels(){
        return List.of(new Fuel(1L, "Бензин 95+", 84.5f ),
                new Fuel(2L, "Бензин 98+", 86.5f ),
                new Fuel(3L, "Дизел", 84.5f ),
                new Fuel(4L, "Плин", 50f )
                );
    }
}
