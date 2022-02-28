package com.company;

/*
 * This is a "Car" class
 * It implements the "Vehicle" interface
 * it contains some attributes and methods
 * 
 */
public class Car implements Vehicle{
	
	// Private attributes of a car
	private int speed;
	private String model;
	private int year;
	private int numberOfWheels = 4;
	private boolean isVehicleStart;
	
	// Paramaterized constructor -> initializes all the attributes
	public Car(int speed, String model, int year, boolean isVehicleStart) {
		super();
		this.speed = speed;
		this.model = model;
		this.year = year;
		this.isVehicleStart = isVehicleStart;
	}
	
	// this is overridden method from vehicle interface
	// based on vehicle type (here car) it provides information about number of wheels
//	@Override
	public int numberOfWheels() {
		return this.numberOfWheels;
	}
	
	// this is overridden method from vehicle interface
	// it reads all the private attributes of car class and prints the details
	@Override
	public void printDetails() {
		System.out.println("Speed: "+this.speed+" km/hr");
		System.out.println("Model: "+this.model);
		System.out.println("Year of Manufacture: "+this.year);
		System.out.println("Number of Wheels: "+this.numberOfWheels());
	}
	
	// this is overridden method from vehicle interface
	// this method prints if the car is running or not based on "isVehicleStart" attribute's value
	@Override
	public void isRunning(){
		// isVehicleStart = true
		if(this.isVehicleStart) {
			System.out.println("Car is running with "+this.speed+" km/hr speed");
		}
		// isVehicleStart = false
		else {
			System.out.println("You forgot to start the engine car is not running!");
		}
	}

}
