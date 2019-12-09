package com.efrei.JPAExample.repositories;

import java.util.List;

import com.efrei.JPAExample.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByName(String name);

}
