package com.efrei.JPAExample.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Person {
	private String name ;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@JsonIgnore
	private Collection<Rent> rents;

	@OneToMany(cascade=CascadeType.ALL, mappedBy="person")
	public Collection<Rent> getRents() {
		return rents;
	}
	public void setRents(Collection<Rent> rents) {
		this.rents = rents;
	}
	public void addRent( Rent rent ){
		this. getRents().add( rent );
		rent.person = this;
	}
}


	/*
	private long id;
	private String name;
	private int age;
	private City city;
	
	public Person() {
		super();
	}

	public Person(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@ManyToOne
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
*/