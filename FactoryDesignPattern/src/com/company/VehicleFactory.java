package com.company;

public class VehicleFactory {
	public static Vehicle createVehicle(String type) {
		if(type.equalsIgnoreCase("car")) {
			return new Car("Car","Swift",2022,200000,"Right");
		}
		else if(type.equalsIgnoreCase("bike")) {
			return new Bike("Bike","Discover",2021,50000);
		}
		else if(type.equalsIgnoreCase("cycle")) {
			return new Cycle("Cycle","Hero",2020,10000);
		}
		return null;
		
	}
}
