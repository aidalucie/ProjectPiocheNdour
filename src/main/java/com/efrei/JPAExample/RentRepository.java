package com.efrei.JPAExample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public interface RentRepository extends CrudRepository<Rent, Long> {

    List<Rent> findByBeginRent(String beginRent);

    @Query ("SELECT r FROM Rent r join Vehicule v on r.vehicule = v where v.plateNumber = :plateNumber")
    List<Rent> findByPlateNumber(@Param("plateNumber") String plateNumber);



}
