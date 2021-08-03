package com.travelopia.travellerplanbe.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.travelopia.travellerplanbe.dao.TravellerRepository;
import com.travelopia.travellerplanbe.entity.Traveller;

@Configuration
public class TravellerConfig {
	
List<Traveller> list = new ArrayList<>();
	
	@Bean
	CommandLineRunner commandLineRunner(TravellerRepository travellerRepository) {
		
		return args -> { Traveller vinay = new Traveller("Vinaya", "vinaya@gmail.com", "India", 3, 2000);
		Traveller arun = new Traveller("Arun", "Arun@gmail.com", "Africa", 2, 3000);
		
		travellerRepository.saveAll(Arrays.asList(vinay, arun));
		};
		
	}
}
