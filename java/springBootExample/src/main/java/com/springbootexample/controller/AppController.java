package com.springbootexample.controller;

import com.springbootexample.entity.City;
import com.springbootexample.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by victor.dvoryaninov on 6/22/2015.
 */
@RestController
public class AppController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/hell")
    public String getHell() {
        City city = new City();
        city.setId(100L);
        city.setName("fff");
        city.setState("dds");
        cityService.addData(city);
        return "hello";
    }
}
