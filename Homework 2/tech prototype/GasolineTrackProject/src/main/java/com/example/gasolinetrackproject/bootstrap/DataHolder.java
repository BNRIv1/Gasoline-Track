package com.example.gasolinetrackproject.bootstrap;

import com.example.gasolinetrackproject.model.City;
import com.example.gasolinetrackproject.model.Company;
import com.example.gasolinetrackproject.model.Fuel;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {


    public static List<City> cities = new ArrayList<>();
    public static List<Company> companies = new ArrayList<>();
    public static List<Fuel> fuels = new ArrayList<>();
}
