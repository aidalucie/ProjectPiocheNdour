package com.efrei.JPAExample.webServices;

import com.efrei.JPAExample.entities.Person;
import com.efrei.JPAExample.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonWebService {


    PersonRepository personRepository;

    @Autowired
    public PersonWebService(PersonRepository personRepository) {
        super();
        this.personRepository = personRepository;

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/persons")
    public Iterable<Person> getPersons(){
        return personRepository.findAll();
    }



}
