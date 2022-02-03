package com.capgemini;

abstract class Mobile1{
	abstract public void calling();
	abstract public void sendingSMS();
	
	public void charging() {
		System.out.println("Charging USB....");
	}
}

class Google1 extends Mobile1{

	@Override
	public void calling() {
		System.out.println("Google calling...");
		
	}

	@Override
	public void sendingSMS() {
		System.out.println("Google sending message...");
		
	}
	
}

public class MyAbstraction {

	public static void main(String[] args) {
		
		Google1 g = new Google1();
		g.calling();
		g.charging();
		g.sendingSMS();

	}

}
