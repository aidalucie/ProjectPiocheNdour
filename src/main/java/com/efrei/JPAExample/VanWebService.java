package com.efrei.JPAExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
