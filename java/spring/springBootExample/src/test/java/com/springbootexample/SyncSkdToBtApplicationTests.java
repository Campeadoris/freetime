package com.springbootexample;

import com.springbootexample.entity.City;
import com.springbootexample.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootExampletApplication.class)
@WebAppConfiguration
public class SyncSkdToBtApplicationTests {

    @Autowired
    private CityService cityService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void cityTest() {
        City city = new City();
        city.setId(100L);
        city.setName("fff");
        city.setState("dds");
        cityService.addData(city);
    }

}
