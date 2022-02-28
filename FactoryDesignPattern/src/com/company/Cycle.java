package com.company;

public class Cycle extends Vehicle {

	private boolean isStopped = true;
	public Cycle(String vehicleType, String modelName, int yearOfManufacture, int price) {
		super(vehicleType, modelName, yearOfManufacture, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		System.out.println("Cycle is running");
	}

	@Override
	public void stop() {
		if(this.isStopped) {
			System.out.println("Cycle stopped");
		}
		else {
			System.out.println("Cycle not stopped apply breaks.");
		}
	}

	@Override
	public void applyBreaks() {
		this.isStopped = true;
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Cycle Stopped : "+this.isStopped);
	}

}
