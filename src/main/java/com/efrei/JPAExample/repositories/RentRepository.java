package com.efrei.JPAExample.repositories;

import java.util.List;

import com.efrei.JPAExample.entities.Rent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RentRepository extends CrudRepository<Rent, Long> {

    List<Rent> findByBeginRent(String beginRent);

    @Query ("SELECT r FROM Rent r join Vehicule v on r.vehicule = v where v.plateNumber = :plateNumber")
    List<Rent> findByPlateNumber(@Param("plateNumber") String plateNumber);



}
