package edu.jspider.DeepClone;

public class Address implements Cloneable{

	String houseNo;
	String street;
	String landmark;
	String district;
	String city;
	String state;
	String country;
	public Address(String houseNo, String street, String landmark, String district, String city, String state,
			String country) {
		this.houseNo = houseNo;
		this.street = street;
		this.landmark = landmark;
		this.district = district;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", landmark=" + landmark + ", district="
				+ district + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
