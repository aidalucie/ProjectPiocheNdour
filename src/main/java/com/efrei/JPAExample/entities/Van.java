package com.efrei.JPAExample.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("VAN")
public class Van extends Vehicule{
    private int maxWeight ;

    public Van() {
        super();
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
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
