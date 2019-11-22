package com.efrei.JPAExample;

import org.springframework.beans.factory.annotation.Autowired;
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
    public Iterable<Rent> showArent(@PathVariable("plateNumber") String plateNumber//,
                          // @RequestParam(value="rent", required = true)boolean rent,
                          //@RequestBody Date begindate
                          //@RequestBody Date enddate
    )
    {
      return rentRepository.findByPlateNumber(plateNumber);
    }


}
