package com.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories(basePackages = "com.springbootexample.repository")
@EntityScan(basePackages = "com.springbootexample.entity")
public class SpringBootExampletApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootExampletApplication.class, args);
    }
}
