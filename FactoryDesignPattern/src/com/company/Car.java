package com.company;

public class Car extends Vehicle{
	
	private boolean ignition = false;
	private String stearing;
	private boolean isStopped = true;

	public Car(String vehicleType, String modelName, int yearOfManufacture, int price, String stearing) {
		super(vehicleType, modelName, yearOfManufacture, price);
		this.stearing = stearing;
	}
	
//	@Override
	public boolean start() {
		return this.ignition;
	}

	@Override
	public void run() {
		
		if(this.start()) {
		System.out.println("vehicle is running with the speed 100km/hr");
		}
		else {
			System.out.println("Car has not started yet please start the car");
			System.out.println("Starting the car ...");
			this.ignition = true;
			this.run();
		}
	}
	
	@Override
	public void applyBreaks() {
		this.isStopped = true;
		
	}
	
	@Override
	public void stop() {
		if(this.isStopped || !this.ignition) {
		System.out.println("Vehicle stopped");
		this.ignition = false;
		}
		else {
			System.out.println("Vehicle is not stopped please apply breaks");
		}
	}
	
	public void turn() {
		if(this.stearing == "Right") {
			System.out.println("Truning Right");
		}
		else {
			System.out.println("Turning Left");
		}
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Car Started : "+this.ignition);
		System.out.println("Car Stopped : "+this.isStopped);
		System.out.println();
	}

}
