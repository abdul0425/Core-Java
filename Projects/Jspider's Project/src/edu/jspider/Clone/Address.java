package edu.jspider.Clone;

public class Address {
	String houseNo;
	String street;
	String area;
	String city;
	String district;
	String state;
	String country;
	
	public Address(String houseNo, String street, String area, String city, String district, String state,
			String country) {
		this.houseNo = houseNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", area=" + area + ", city=" + city
				+ ", district=" + district + ", state=" + state + ", country=" + country + "]";
	}
	
	
	
}
