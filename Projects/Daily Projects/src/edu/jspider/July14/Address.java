package edu.jspider.July14;

public class Address implements Cloneable{

	String houseNo;
	String street;
	String landMark;
	String city;
	String district;
	String state;
	public Address(String houseNo, String street, String landMark, String city, String district, String state) {
		this.houseNo = houseNo;
		this.street = street;
		this.landMark = landMark;
		this.city = city;
		this.district = district;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", landMark=" + landMark + ", city=" + city
				+ ", district=" + district + ", state=" + state + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
