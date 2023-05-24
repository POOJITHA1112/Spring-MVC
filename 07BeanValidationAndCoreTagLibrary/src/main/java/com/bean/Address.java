package com.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Address {
	
	@NotBlank(message = "must specify the street ")
	private String street;
	
	
	@NotBlank(message = "must specify the state")
	private String state;
	
	
	@NotNull(message = "zip code is required")
	private int zipcode;
	
	public Address() {
		
	}

	public Address(String street, String state, int zipcode) {
		super();
		this.street = street;
		this.state = state;
		this.zipcode = zipcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
	
	

}
