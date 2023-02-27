package com.demo.service.airbnbService.controller;

import com.demo.service.airbnbService.model.Property;
import com.demo.service.airbnbService.repo.InMemoryPropertyDB;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropertyController {

    @GetMapping("/property")
    public List<Property> getProperties() {
        return InMemoryPropertyDB.getProperties();
    }

    @GetMapping("/property/{id}")
    public Property getProperty(@PathVariable String id) {
        for (Property property : InMemoryPropertyDB.getProperties()) {
            if (property.getPropertyId().equals(id))
                return property;
        }
        throw new RuntimeException("No Property Found with provided Id: " + id);
    }
}
