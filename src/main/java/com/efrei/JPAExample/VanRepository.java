package com.efrei.JPAExample;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VanRepository extends CrudRepository<Van, Long> {

    List<Van> findByPlateNumber(String plateNumber);

}
