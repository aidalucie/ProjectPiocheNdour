package com.efrei.JPAExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class RentWebService {

    RentRepository rentRepository;

    @Autowired
    public RentWebService(RentRepository rentRepository) {
        super();
        this.rentRepository = rentRepository;

    }

    @GetMapping("/rents")
    public Iterable<Rent> getRents() {
    return rentRepository.findAll();
    }

    @RequestMapping(value = "/rents/{plateNumber}", method = RequestMethod.GET)
    public Iterable<Rent> showArent(@PathVariable("plateNumber") String plateNumber
    )
    {
      return rentRepository.findByPlateNumber(plateNumber);
    }


    @RequestMapping(value = "/rents/{plateNumber}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK) public void
    rentAndGetBack(@PathVariable("plateNumber") String plateNumber) throws Exception{
    }

}
