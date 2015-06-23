package com.springbootexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.springbootexample.entity.City;
import com.springbootexample.repository.CityRepository;

/**
 * Created by victor.dvoryaninov on 6/22/2015.
 */
@Component
public class CityService {

    @Autowired
    CityRepository cityRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addData(City city) {
        cityRepository.saveAndFlush(city);
    }
}
