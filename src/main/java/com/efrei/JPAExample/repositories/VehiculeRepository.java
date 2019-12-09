package com.efrei.JPAExample.repositories;

import java.util.List;

import com.efrei.JPAExample.entities.Vehicule;
import org.springframework.data.repository.CrudRepository;

public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {

    List<Vehicule> findByPlateNumber(String plateNumber);

}
