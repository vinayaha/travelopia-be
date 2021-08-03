package com.travelopia.travellerplanbe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelopia.travellerplanbe.dao.TravellerRepository;
import com.travelopia.travellerplanbe.entity.Traveller;

@Service
public class TravellerService {
	
	private final TravellerRepository travellerRepository;
	
	@Autowired
	public TravellerService(TravellerRepository travellerRepository) {
		this.travellerRepository = travellerRepository;
	}
	
	public List<Traveller> getTraveller() {
		return travellerRepository.findAll();
	}
	
	public void addTraveller(Traveller traveller) {
		Optional<Traveller> optionalLaptop = travellerRepository.findById(traveller.getId());
		if(optionalLaptop.isPresent()) {
			throw new IllegalStateException();
		}
		travellerRepository.save(traveller);
	}
}
