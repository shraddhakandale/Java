package com.company;

// Main class
public class FactoryDesignPattern {

	public static void main(String[] args) {
		VehicleFactory vf = new VehicleReadyToDeliver();
		
        Vehicle car = vf.createVehicle("car");
        car.isRunning();
        
        System.out.println("========================================");
        
        Vehicle bike = vf.createVehicle("bike");
        bike.isRunning();
	}

}
