package com.example.SpringSecurityDemo.controller;

import com.example.SpringSecurityDemo.model.City;
import com.example.SpringSecurityDemo.service.CityService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class MyController {

    CityService cityService;

    public MyController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(value = "/cities", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<City> getCities() {
        return cityService.getCities();
    }
}
