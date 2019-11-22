package com.efrei.JPAExample;

import javax.persistence.*;
import java.util.Collection;

@Entity
@DiscriminatorValue("CAR")
public class Car extends Vehicule {
    private int numberOfSeats;

    public Car() {
        super();
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
