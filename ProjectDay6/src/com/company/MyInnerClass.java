package com.company;

// when class contains any other class it is called as inner class

// we cannot create object of interface 
// we can either implement it or can use anonymous class to create its object
interface A{
	int a = 10;
	public void print();
}

class OuterClass{
	
	InnerClass2 inner2 = new InnerClass2();
	// method of outer class
	public void printOuter() {
		System.out.println("Outer class");
		
		inner2.printInner2();
	}
	
	// Inner class
	// it can be accessed with class name
	static class InnerClass{
		public void printInner() {
			System.out.println("Inner class");
		}
	}
	
	// if we are not declaring inner class as static then 
	// we have to create its object in outer class
	// and call its methods in outer class's method
	class InnerClass2{
		public void printInner2() {
			System.out.println("Inner class2");
		}
	}
}

public class MyInnerClass {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.printOuter();
		
		OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
		innerClass.printInner();
		
		// creating object of interface by using anonymous class
		A objA = new A() {

			@Override
			public void print() {
				System.out.println("Interface variable : "+a);
			}
			
		};
		objA.print();

	}

}
