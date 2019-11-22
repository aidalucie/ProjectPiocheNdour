package com.efrei.JPAExample;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rent {
    private Date beginRent;
    private Date endRent;

    public Rent() {
    }

    public Date getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
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

    Vehicule vehicule;
    @ManyToOne
    public Vehicule getVehicule() {
        return vehicule;
    }
    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    Person person;
    @ManyToOne
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }


}
