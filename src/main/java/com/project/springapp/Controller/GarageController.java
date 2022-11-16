package com.project.springapp.Controller;

import com.project.springapp.Model.Car;
import com.project.springapp.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GarageController {

    @Autowired
    private GarageService garageService ;


    @RequestMapping(method = RequestMethod.GET,  value = "/cars")
   public List<Car> getcars(){

        return garageService.getcars();
   }

   @RequestMapping("/car/{id}")
   public  Car getCar(@PathVariable long id){
        return garageService.getCar(id);
   }


   @RequestMapping(method = RequestMethod.DELETE , value = "/car/{id}")
   public void deletecar (@PathVariable long id ){
        garageService.deletecar(id);
   }

   @PostMapping ("/addcar")
   public void addcar(@RequestBody Car car) {
        garageService.addcar(car);
   }

   @RequestMapping(method = RequestMethod.PUT , value = "/mcar/{id}")
   public void modifycar(@RequestBody Car car, @PathVariable long id){
        garageService.modifycar(car,id);
   }
}
