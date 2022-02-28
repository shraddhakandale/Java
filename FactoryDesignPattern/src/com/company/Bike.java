package com.company;

public class Bike extends Vehicle implements Runnable {
	
	private boolean buttonStart = false;
	private boolean isStopped = true;
	
	public Bike(String vehicleType, String modelName, int yearOfManufacture, int price) {
		super(vehicleType, modelName, yearOfManufacture, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean start() {
		return this.buttonStart;
	}
	
	@Override
	public void run() {
		if(this.start()) {
			System.out.println("Bike is running with the speed 60km/hr");
			}
			else {
				System.out.println("Bike has not started yet please start the car");
				System.out.println("Starting the bike ...");
				this.buttonStart = true;
				this.run();
			}
	}

	@Override
	public void stop() {
		if(this.isStopped || !this.buttonStart) {
			System.out.println("Bike stopped");
			this.buttonStart = false;
			}
			else {
				System.out.println("Bike is not stopped please apply breaks");
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
