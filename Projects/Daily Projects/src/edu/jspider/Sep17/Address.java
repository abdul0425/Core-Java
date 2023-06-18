package edu.jspider.Sep17;

public class Address implements Cloneable {

	String houseNo;
	String street;
	String landmark;
	String city;
	String district;
	String state;
	String country;

	public Address(String houseNo, String street, String landmark, String city, String district, String state,
			String country) {
		this.houseNo = houseNo;
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.district = district;
		this.country = country;
		this.state = state;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", landmark=" + landmark + ", city=" + city
				+ ", district=" + district + ", State= " + state + ", country=" + country + "]";
	}

}
