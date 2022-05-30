package com.Masai;

public class Car {
	
	
	private int numberOfPassenger;
	private int numberOfKms;
	
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
	
	public Car() {
		
	}

}

class Sedan  extends Car{
	final int farePerKm =20;
}

class HatchBack  extends Car{
	final int farePerKm =15;
}