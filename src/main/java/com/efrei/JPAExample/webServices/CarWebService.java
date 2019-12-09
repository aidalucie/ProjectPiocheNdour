package com.efrei.JPAExample.webServices;

import com.efrei.JPAExample.entities.Car;
import com.efrei.JPAExample.repositories.CarRepository;
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

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/cars")
    public Iterable<Car> getCars(){
        System.out.println("okk");
        return carRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.GET)
    public Iterable<Car> showAcar(@PathVariable("plateNumber") String plateNumber
    )
    {
        return carRepository.findByPlateNumber(plateNumber);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addCar(@PathVariable("plateNumber") String plateNumber) throws Exception{
        Car car = new Car();
        car.setPlateNumber(plateNumber);
        carRepository.save(car);
    }





}
