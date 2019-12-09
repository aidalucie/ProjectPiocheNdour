package com.efrei.JPAExample.webServices;

import com.efrei.JPAExample.entities.Vehicule;
import com.efrei.JPAExample.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VehiculeWebService {

	VehiculeRepository vehiculeRepository;

	@Autowired
	public VehiculeWebService(VehiculeRepository vehiculeRepository) {
		super();
		this.vehiculeRepository = vehiculeRepository;

	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/vehicules")
	public Iterable<Vehicule> getVehicules(){
		return vehiculeRepository.findAll();
	}


	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/vehicules/{plateNumber}", method = RequestMethod.GET)
	public Iterable<Vehicule> showAVehicule(@PathVariable("plateNumber") String plateNumber
	)
	{
		return vehiculeRepository.findByPlateNumber(plateNumber);
	}

}
