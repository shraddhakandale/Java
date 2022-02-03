package com.capgemini;

class Customer{
	private String emailId;
	private int mobNum;
	
	public Customer(String emailId, int mobNum){
		this.emailId = emailId;
		this.mobNum = mobNum;
	}
	
	// methods
	public void orderStatus() {
		System.out.println("Customer Id : "+this.emailId);
		System.out.println("Customer contact : "+this.mobNum);
		System.out.println("Order status : Reviewing menu ....");
	}
	public void placeOrder() {
		System.out.println("Customer Id : "+this.emailId);
		System.out.println("Customer contact : "+this.mobNum);
		System.out.println("Order status : Order placed successfully!");
	}
	
	public void cancelOrder() {
		System.out.println("Customer Id : "+this.emailId);
		System.out.println("Customer contact : "+this.mobNum);
		System.out.println("Order status : Order cancelled successfully!");
	}
}

public class MyCustomer {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("customer@c1.com",123456);
		c1.placeOrder();
		
		System.out.println("==============================================");
		
		Customer c2 = new Customer("customer@c2.com",456123);
		c2.cancelOrder();
		
		System.out.println("==============================================");
		
		Customer c3 = new Customer("customer@c3.com",789456);
		c3.orderStatus();
		
	}

}
