package com.capgemini;

class Laptop{
	private int price;
	private String brand;
	private int ramStorage;
	
	Laptop(){
		
	}
	
	Laptop(int price, String brand, int ramStorage){
		this.price = price;
		this.brand = brand;
		this.ramStorage = ramStorage;
	}
	
	//setters
	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setRamStorage(int ramStorage) {
		this.ramStorage = ramStorage;
	}
	
	//getters
	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}

	public int getRamStorage() {
		return ramStorage;
	}
	
	//method
	public void print() {
		System.out.println("Brand Name : "+this.brand);
		System.out.println("Price : "+this.price);
		System.out.println("Ram Storage : "+this.ramStorage);
	}

}

public class MyLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop dell = new Laptop();
		dell.setPrice(40000);
		dell.setBrand("Dell");
		dell.setRamStorage(8);
		
		System.out.println("Brand Name : "+dell.getBrand());
		System.out.println("Price : "+dell.getPrice());
		System.out.println("Ram Storage : "+dell.getRamStorage());
		
		System.out.println("==============================================");
		
		Laptop hp = new Laptop(50000,"HP",12);
		hp.print();
		
		System.out.println("==============================================");
		
		Laptop sample = new Laptop();
		sample.print();

	}

}
