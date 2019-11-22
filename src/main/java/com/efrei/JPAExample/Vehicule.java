package com.efrei.JPAExample;

import javax.persistence.*;
import java.util.Collection;

@Entity
@DiscriminatorColumn(name="TypeVehicule" , discriminatorType=DiscriminatorType.STRING)

public abstract class Vehicule {



    private String plateNumber;
    private Long id;

    public Vehicule(String plateNumber, Long id, Collection<Rent> rents) {
        this.plateNumber = plateNumber;
        this.id = id;
        this.rents = rents;
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

