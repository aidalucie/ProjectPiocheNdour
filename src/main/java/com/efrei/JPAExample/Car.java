package com.efrei.JPAExample;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.util.Collection;

@Entity
public class Car extends Vehicule {
    private int numberOfSeats;

    public Car(String plateNumber, Long id, Collection<Rent> rents, int numberOfSeats, Long id1) {
        super(plateNumber, id, rents);
        this.numberOfSeats = numberOfSeats;
        this.id = id1;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
    public void setId(Long id ){
        this.id = id;
    }

}
