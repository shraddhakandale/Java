package com.capgemini;

// Interface -> interface in java it contains all the abstract methods and it is the way of implementing
// multiple inheritance

interface Mobile{
	public void calling();
	public void sendSms();
}

class Google implements Mobile{
	
	public void extraMethod() {
		System.out.println("Android phone");
	}

	@Override
	public void calling() {
		System.out.println("Google 4g calling...");
		
	}

	@Override
	public void sendSms() {
		System.out.println("Google 4g sending SMS...");
		
	}
	
}

class Apple implements Mobile{
	
	public void extraMethod() {
		System.out.println("IOS");
	}

	@Override
	public void calling() {
		System.out.println("Apple calling.....");
		
	}

	@Override
	public void sendSms() {
		System.out.println("Apple sending SMS....");
		
	}
	
}

public class MyInterface {

	public static void main(String[] args) {
		
		Google g1 = new Google();
		g1.extraMethod();
		g1.calling();
		g1.sendSms();
		
		Apple a1 = new Apple();
		a1.extraMethod();
		a1.calling();
		a1.sendSms();
		
	}

}
