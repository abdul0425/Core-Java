package edu.jspider.July15;

public class Address implements Cloneable{

	String houseNo;
	String street;
	String landmark;
	String city;
	String district;
	String state;
	public Address(String houseNo, String street, String landmark, String city, String district, String state) {
		this.houseNo = houseNo;
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.district = district;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", landmark=" + landmark + ", city=" + city
				+ ", district=" + district + ", state=" + state + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
