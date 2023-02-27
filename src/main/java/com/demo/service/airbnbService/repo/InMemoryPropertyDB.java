package com.demo.service.airbnbService.repo;

import com.demo.service.airbnbService.model.Property;

import java.util.Arrays;
import java.util.List;

public class InMemoryPropertyDB {

    public static List<Property> getProperties() {
        Property property1 = new Property("1", "Sam", "Pune", "4", "Barry");
        Property property2 = new Property("2", "Aman", "Pune", "4", "Mike");
        Property property3 = new Property("3", "Potter", "Hogwarts", "5", "Harvey");
        Property property4 = new Property("4", "Morris", "US", "3", "Pandey");
        Property property5 = new Property("5", "Albert", "England", "4", "Samson");

        return Arrays.asList(property1, property2, property3, property4, property5);

    }
}
