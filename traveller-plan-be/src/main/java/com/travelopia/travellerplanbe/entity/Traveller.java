package com.travelopia.travellerplanbe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Traveller {
	
	@Id
	@SequenceGenerator(
			name="traveller_sequence",
			sequenceName="traveller_sequence",
			allocationSize=1
	)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator = "traveller_sequence"
	)
	private int id;
	private String name;
	private String email;
	private String country;
	private int numberOfTravellers;
	private int budget;
	
	public Traveller() {
		super();
	}

	public Traveller(String name, String email, String country, int numberOfTravellers, int budget) {
		super();
		//this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
		this.numberOfTravellers = numberOfTravellers;
		this.budget = budget;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNumberOfTravellers() {
		return numberOfTravellers;
	}

	public void setNumberOfTravellers(int numberOfTravellers) {
		this.numberOfTravellers = numberOfTravellers;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

}
