package com.company;

/*
 * This is a "Vehicle" interface 
 * It consists 3 abstract methods
 */
interface Vehicle {
	
	// this method prints the details about the vehicle
	public void printDetails();
	
	// this methods gives information about the number of wheels of vehicle
	public int numberOfWheels();
	
	// this method tells whether is vehicle is running or not depending on certain conditions
	public void isRunning();
	
}
