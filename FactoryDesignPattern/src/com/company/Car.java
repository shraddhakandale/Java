package com.company;

public class Car extends Vehicle implements Runnable{
	
	private boolean ignition = false;
	private String stearing = "Right";
	private boolean isStopped = true;
	private Indicator indicator;
	
	class Indicator{
		private String leftInd;
		private String rightInd;
		
		Indicator(){
			this.leftInd = "off";
			this.rightInd = "on";
		}
		
		public void printIndicatorState() {
			if(this.leftInd == "on") {
			System.out.println("Left indicator is on");
			}
			else {
				System.out.println("Right indicator is on");
			}
		}
	}
	

	public Car(String vehicleType, String modelName, int yearOfManufacture, int price, String stearing) {
		super(vehicleType, modelName, yearOfManufacture, price);
		this.stearing = stearing;
		this.indicator = new Indicator();
	}
	
	@Override
	public boolean start() {
		return this.ignition;
	}

	@Override
	public void run() {
		
		if(this.start()) {
		System.out.println("Car is running with the speed 100km/hr");
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
		System.out.println("Car stopped");
		this.ignition = false;
		}
		else {
			System.out.println("Car is not stopped please apply breaks");
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
		this.indicator.printIndicatorState();
		this.turn();
		System.out.println("Car Started : "+this.ignition);
		System.out.println("Car Stopped : "+this.isStopped);
		System.out.println();
	}

}
