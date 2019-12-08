package com.efrei.JPAExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarWebService {

    CarRepository carRepository;

    @Autowired
    public CarWebService(CarRepository carRepository) {
        super();
        this.carRepository = carRepository;
    }

    @GetMapping("/cars")
    public Iterable<Car> getCars(){
        return carRepository.findAll();
    }

    @RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addCar(@PathVariable("plateNumber") String plateNumber) throws Exception{
        Car car = new Car();
        car.setPlateNumber(plateNumber);
        carRepository.save(car);
    }





}
