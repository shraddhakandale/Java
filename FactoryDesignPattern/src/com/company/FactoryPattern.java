package com.company;

public class FactoryPattern {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.createVehicle("car");
		car.printDetails();
		car.run();
//		car.start();
		car.stop();
		car.run();
		
		Vehicle bike = VehicleFactory.createVehicle("bike");
		bike.printDetails();
		
		Vehicle cycle = VehicleFactory.createVehicle("cycle");
		cycle.printDetails();
	}

}
