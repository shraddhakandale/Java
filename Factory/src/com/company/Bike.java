package com.company;

/*
 * This is a "Bike" class
 * It implements the "Vehicle" interface
 * it contains some attributes and methods
 * 
 */

public class Bike implements Vehicle {

	// private attributes of bike
	private int speed;
	private String model;
	private int year;
	private int numOfWheels = 2;
	private boolean isVehicleStart;
	
	// parameterized constructor
	public Bike(int speed, String model, int year, boolean isVehicleStart) {
		super();
		this.speed = speed;
		this.model = model;
		this.year = year;
		this.isVehicleStart = isVehicleStart;
	}
	
	// this is overridden method from vehicle interface
	// based on vehicle type (here bike) it provides information about number of wheels
	@Override
	public int numberOfWheels() {
		return this.numOfWheels;
	}
	
	// this is overridden method from vehicle interface
	// it reads all the private attributes of bike class and prints the details
	@Override
	public void printDetails() {
		System.out.println("Speed: "+this.speed+" km/hr");
		System.out.println("Model: "+this.model);
		System.out.println("Year of Manufacture: "+this.year);
		System.out.println("Number of Wheels: "+this.numberOfWheels());
	}

	// this is overridden method from vehicle interface
	// this method prints if the bike is running or not based on "isVehicleStart" attribute's value
	@Override
	public void isRunning(){
		// isVehicleStart = true
		if(this.isVehicleStart) {
			System.out.println("Bike is running with "+this.speed+" km/hr speed");
		}
		// isVehicleStart = false
		else {
			System.out.println("You forgot to start the engine Bike is not running!");
		}
	}
	
}
