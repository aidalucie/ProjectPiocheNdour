package com.efrei.JPAExample.repositories;

import java.util.List;

import com.efrei.JPAExample.entities.Car;
import com.efrei.JPAExample.entities.Rent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findByPlateNumber(String plateNumber);


}
