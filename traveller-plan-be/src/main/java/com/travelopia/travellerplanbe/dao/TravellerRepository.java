package com.travelopia.travellerplanbe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelopia.travellerplanbe.entity.Traveller;

public interface TravellerRepository extends JpaRepository<Traveller, Integer> {

}
