package edu.jspider.OwnMarkerInterface;

public class WashingVehicle {

	public static void main(String[] args) {
		WasherMan staff=new WasherMan();
		staff.wash(new Car());
		staff.wash(new Tv());
	}

}
