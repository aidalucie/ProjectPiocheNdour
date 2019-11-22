package com.efrei.JPAExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class VehiculeWebService {

	VehiculeRepository vehiculeRepository;

	@Autowired
	public VehiculeWebService(VehiculeRepository vehiculeRepository) {
		super();
		this.vehiculeRepository = vehiculeRepository;

	}
	
	@GetMapping("/vehicules")
	public Iterable<Vehicule> getVehicules(){
		return vehiculeRepository.findAll();
	}


}
