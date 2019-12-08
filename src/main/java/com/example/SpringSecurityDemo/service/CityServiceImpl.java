package com.example.SpringSecurityDemo.service;

import com.example.SpringSecurityDemo.model.City;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Override
    public List<City> getCities() {
        List<City> cities = new ArrayList<>();
        City city = new City("Bhubaneswar", "BBSR", "Odisha");
        cities.add(city);
        city = new City("Cuttack", "CTC", "Odisha");
        cities.add(city);
        return cities;
    }
}
