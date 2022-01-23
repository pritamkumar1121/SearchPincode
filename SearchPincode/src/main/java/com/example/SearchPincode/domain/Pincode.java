package com.example.SearchPincode.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pincode {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long pin;
	private String location;
	
	
	
	
	public Pincode() {
		
	}
	
	
	public Pincode(long pin, String location) {
		super();
		this.pin = pin;
		this.location = location;
	}
	
	
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Pincode [pin=" + pin + ", location=" + location + "]";
	}
	
	

}
