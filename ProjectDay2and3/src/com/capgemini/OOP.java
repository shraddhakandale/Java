package com.capgemini;

class Phone{
	
	// declare all member variables
	private int price;
	private String brand;
	private String color;
	private int storage;
	private float screenSize;
	
	//constructor -> method having the same name as the class name and it does not have any return type
	// if there isn't any constructor then java will automatically create the default constructor
	
	//default constructor
	Phone() {
		
	}
	
	// overloading constructor || overloading is method with the same name but with different parameters
	//parameterized constructor
	Phone(int price, String brand, String color, int storage, float screenSize){
		
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.storage = storage;
		this.screenSize = screenSize;
	}
	
	//setters -> setting the values
	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}
	
	//getters -> get the values
	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public int getStorage() {
		return storage;
	}

	public float getScreenSize() {
		return screenSize;
	}

	// method 
	public void printDetails() {
		System.out.println("Brand :"+this.brand);
		System.out.println("Price :"+this.price);
		System.out.println("Color :"+this.color);
		System.out.println("Storage :"+this.storage);
		System.out.println("ScreenSize :"+this.screenSize);
	}
	
	//business logic method
	
}


public class OOP {
	// part1 - member variables
	
	
	// part2 - methods
	public static void main(String[] args) {
		
		// object with parameterized constructor
		Phone Nokia = new Phone(10000,"Nokia","black",64,5.5f);
		Nokia.printDetails();
		
		System.out.println("======================================");
		
		// object with default constructor
		Phone samplePhone = new Phone();
		//setting values using setters
		samplePhone.setBrand("Samsung");
		samplePhone.setColor("White");
		samplePhone.setPrice(15000);
		samplePhone.setScreenSize(4.0f);
		samplePhone.setStorage(32);
		//samplePhone.printDetails();
		
		//printing values using getters
		System.out.println("Brand :"+samplePhone.getBrand());
		System.out.println("Price :"+samplePhone.getPrice());
		System.out.println("Color :"+samplePhone.getColor());
		System.out.println("Storage :"+samplePhone.getStorage());
		System.out.println("ScreenSize :"+samplePhone.getScreenSize());
	}

}
