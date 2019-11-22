package com.efrei.JPAExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonWebService {


    PersonRepository personRepository;

    @Autowired
    public PersonWebService(PersonRepository personRepository) {
        super();
        this.personRepository = personRepository;

    }

    @GetMapping("/persons")
    public Iterable<Person> getPersons(){
        return personRepository.findAll();
    }



}
