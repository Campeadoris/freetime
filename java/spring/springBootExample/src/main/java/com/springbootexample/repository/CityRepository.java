package com.springbootexample.repository;

import com.springbootexample.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by victor.dvoryaninov on 6/22/2015.
 */

public interface CityRepository extends JpaRepository<City, Long> {


}
