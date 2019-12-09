package com.efrei.JPAExample.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@DiscriminatorColumn(name="TypeVehicule" , discriminatorType=DiscriminatorType.STRING)

public abstract class Vehicule {



    private String plateNumber;
    private Long id;

    public Vehicule() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id ){
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @JsonIgnore
    private Collection<Rent> rents;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="vehicule")
    public Collection<Rent> getRents() {
        return rents;
    }
    public void setRents(Collection<Rent> rents) {
        this.rents = rents;
    }
    public void addRent( Rent rent ){
        this. getRents().add( rent );
        rent.vehicule = this;
    }




}

