package com.company;

//import com.company.Bike.Petrol;

public class FactoryPattern {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.createVehicle("car");
		car.printDetails();
		car.run();
		car.stop();
		car.run();
		
		System.out.println();
		
		Vehicle bike = VehicleFactory.createVehicle("bike");
		bike.printDetails();
		bike.run();
		bike.stop();
		bike.run();
		
		System.out.println();
		
		Vehicle cycle = VehicleFactory.createVehicle("cycle");
		cycle.printDetails();
	}

}
