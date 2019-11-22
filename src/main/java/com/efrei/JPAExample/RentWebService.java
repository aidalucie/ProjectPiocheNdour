package com.efrei.JPAExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentWebService {

    RentRepository rentRepository;

    @Autowired
    public RentWebService(RentRepository rentRepository) {
        super();
        this.rentRepository = rentRepository;
    }
/*
    @GetMapping("/rents")
    public Iterable<Rent> getRents(){
        return rentRepository.findAll();
    }
*/

}
