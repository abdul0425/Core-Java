package edu.jspider.July16;

public class Car {

	String carName;
	int carId;
	String carColor;
	public Car(String carName, int carId, String carColor) {
		this.carName = carName;
		this.carId = carId;
		this.carColor = carColor;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carId=" + carId + ", carColor=" + carColor + "]";
	}
	
	
}
