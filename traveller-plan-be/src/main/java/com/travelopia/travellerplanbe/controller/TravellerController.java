package com.travelopia.travellerplanbe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelopia.travellerplanbe.entity.Traveller;
import com.travelopia.travellerplanbe.service.TravellerService;

@CrossOrigin
@RestController
@RequestMapping("api/traveller")
public class TravellerController {
	
	private final TravellerService travellerService;
	
	@Autowired
	public TravellerController(TravellerService travellerService) {
		this.travellerService = travellerService;
	}
	
	@GetMapping
	public List<Traveller> getTraveller() {
		return travellerService.getTraveller();
	}
	
	@PostMapping
	public void addTraveller(@RequestBody Traveller traveller) {
		System.out.println("Traveller Object: " + traveller.toString());
		travellerService.addTraveller(traveller);
	}
}
