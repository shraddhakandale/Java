package com.company;

public class Bike extends Vehicle implements StartVehicle {
	
	private boolean buttonStart = false;
	private boolean isStopped = true;
	
	public Bike(String vehicleType, String modelName, int yearOfManufacture, int price) {
		super(vehicleType, modelName, yearOfManufacture, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void start() {
		if(this.buttonStart) {
			System.out.println("Bike has already started check speed.");
		}
		else {
			this.buttonStart = true;
			System.out.println("Bike started");
		}
	}
	
	@Override
	public void run() {
		if(this.buttonStart) {
		System.out.println("vehicle is running with the speed 60km/hr");
		}
		else {
			System.out.println("Bike has not started . start the bike");
		}
	}

	@Override
	public void stop() {
		if(this.isStopped || !this.buttonStart) {
			System.out.println("Vehicle stopped");
			}
			else {
				System.out.println("Vehicle is not stopped please apply breaks");
			}
	}

	@Override
	public void applyBreaks() {
		this.isStopped = true;
		
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Bike Started : "+this.buttonStart);
		System.out.println("Bike Stopped : "+this.isStopped);
		System.out.println();
	}


}
