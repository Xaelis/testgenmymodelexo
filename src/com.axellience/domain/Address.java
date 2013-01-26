package com.axellience.domain;

//Start of user code Import bloc for Class Address

//End of user code



public class Address
{
	
	
	protected String city;
	
	
	protected Country country;
	
	
	protected String street;
	
	
	protected String zipcode;

	//Start of user code Attribute bloc for Class Address

	//End of user code

	public Address(){
		//Start of user code standard constructor bloc for Class Address

		//End of user code
	}

	//Start of user code Other constructor bloc for Class Address

	//End of user code

	
	
	public String getCity() {
		return this.city;	
	}
	
	
	
	public Country getCountry() {
		return this.country;	
	}
	
	
	
	public String getStreet() {
		return this.street;	
	}
	
	
	
	public String getZipcode() {
		return this.zipcode;	
	}
	
	
	
	public void setCity(String myCity) {
		this.city = myCity;	
	}
	
	
	
	public void setCountry(Country myCountry) {
		this.country = myCountry;	
	}
	
	
	
	public void setStreet(String myStreet) {
		this.street = myStreet;	
	}
	
	
	
	public void setZipcode(String myZipcode) {
		this.zipcode = myZipcode;	
	}
	
	
	
	public void unsetCity() {
		this.city = null;	
	}
	
	
	
	public void unsetCountry() {
		this.country = new Country();	
	}
	
	
	
	public void unsetStreet() {
		this.street = null;	
	}
	
	
	
	public void unsetZipcode() {
		this.zipcode = null;	
	}
	
	//Start of user code Method bloc for Class Address

	//End of user code

}

