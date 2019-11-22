package com.efrei.JPAExample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public interface RentRepository extends CrudRepository<Rent, Long> {

    List<Rent> findByBeginRent(String beginRent);

    @RestController
    class RentWebService {

        RentRepository rentRepository;

        @Autowired
        public RentWebService(RentRepository rentRepository) {
            super();
            this.rentRepository = rentRepository;
        }

        @GetMapping("/rents")
        public Iterable<Rent> getRents(){
            return rentRepository.findAll();
        }


    }
}
