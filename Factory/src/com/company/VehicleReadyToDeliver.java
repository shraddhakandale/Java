package com.company;

/*
 * this concrete class which extends factory class
 * this class implements the createVehicle method
 */

public class VehicleReadyToDeliver extends VehicleFactory {

	// this method return the vehicle based on its type
	@Override
	public Vehicle createVehicle(String type) {

		Vehicle v;
		switch (type.toLowerCase()) {

		case "car":
			v = new Car(50, "Swift", 2022, true);
			v.printDetails();
			break;
		case "bike":
			v = new Bike(30, "Discover", 2021, false);
			v.printDetails();
			break;
		default:
			throw new IllegalArgumentException("No such Vehicle.");

		}
		return v;
	}

}
