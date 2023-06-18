package edu.jspider.Clone;

public class StudentAddress implements Cloneable{
	String houseNo;
	String street;
	String area;
	String city;
	String district;
	String state;
	String country;
	
	public StudentAddress(String houseNo, String street, String area, String city, String district, String state,
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
		return "StudentAddress [houseNo=" + houseNo + ", street=" + street + ", area=" + area + ", city=" + city
				+ ", district=" + district + ", state=" + state + ", country=" + country + "]";
	}

	@Override
	protected StudentAddress clone() throws CloneNotSupportedException {
		return (StudentAddress)super.clone();
	}
	
	
	
	
}
