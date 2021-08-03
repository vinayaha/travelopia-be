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

	@Override
	public String toString() {
		return "Traveller [id=" + id + ", name=" + name + ", email=" + email + ", country=" + country
				+ ", numberOfTravellers=" + numberOfTravellers + ", budget=" + budget + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + budget;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfTravellers;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Traveller other = (Traveller) obj;
		if (budget != other.budget)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfTravellers != other.numberOfTravellers)
			return false;
		return true;
	}

}
