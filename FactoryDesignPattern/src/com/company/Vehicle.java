package com.company;

public abstract class Vehicle {
	
	private String vehicleType;
	private String modelName;
	private int yearOfManufacture;
	private int price;
	
	public Vehicle(String vehicleType,String modelName, int yearOfManufacture, int price) {
		this.modelName = modelName;
		this.yearOfManufacture = yearOfManufacture;
		this.price = price;
		this.vehicleType = vehicleType;
	}
	
	public abstract void run();
	public abstract void stop();
	public abstract void applyBreaks();
	
	public void printDetails() {
		System.out.println("******"+this.vehicleType+"******");
		System.out.println("Model : "+this.modelName);
		System.out.println("Year of Mnufacture : "+this.yearOfManufacture);
		System.out.println("Price : "+this.price);
	}

//	protected abstract void start();
}
