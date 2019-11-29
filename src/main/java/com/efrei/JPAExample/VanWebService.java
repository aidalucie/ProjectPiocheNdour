package com.efrei.JPAExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class VanWebService {

    VanRepository vanRepository;

    @Autowired
    public VanWebService(VanRepository vanRepository) {
        super();
        this.vanRepository = vanRepository;
    }

    @GetMapping("/vans")
    public Iterable<Van> getVans(){
        return vanRepository.findAll();
    }

    @RequestMapping(value = "/vans", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addVan(@RequestBody Van van) throws Exception{
        vanRepository.save(van);
    }


}
