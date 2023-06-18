package edu.jspider.Composition;

public class Address {

	String houseNo;
	String street;
	String area;
	String city;
	String state;
	String country;
	
	
	
	
	public Address(String houseNo, String street, String area, String city, String state, String country) {
		this.houseNo = houseNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
	}




	public void address()
	{
		System.out.println("House No : "+houseNo);
		System.out.println("Street : "+street);
		System.out.println("Area : "+area);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Country : "+country);
	}
}
