package com.efrei.JPAExample.repositories;

import java.util.List;

import com.efrei.JPAExample.entities.Van;
import org.springframework.data.repository.CrudRepository;

public interface VanRepository extends CrudRepository<Van, Long> {

    List<Van> findByPlateNumber(String plateNumber);

}
