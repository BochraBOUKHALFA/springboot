package com.project.springapp.Repository;

import com.project.springapp.Model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface Garagemongodb extends MongoRepository<Car , Long > {

}
