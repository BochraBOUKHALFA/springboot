package com.project.springapp.service;


import com.project.springapp.Model.Car;
import com.project.springapp.Repository.Garagemongodb;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
@Repository

public class GarageService {

    @Autowired
    public Garagemongodb garagemongodb ;

    public List<Car> getcars(){
        List<Car > cars = new ArrayList<>();
        garagemongodb.findAll().forEach(car -> {
            cars.add(car);
        });
        return cars;
    }

    public Car getCar(long id) {
        return garagemongodb.findById(id).orElse(null);
    }

    public void deletecar(long id) {
        garagemongodb.deleteById(id);
    }

    public void addcar(Car car) {
        garagemongodb.save(car);
    }

    public void modifycar(Car car, long id) {
         garagemongodb.save(car);
    }
}

