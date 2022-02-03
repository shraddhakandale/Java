package com.capgemini;

// Hierarchical inheritance -> when there are two or more classes derived from single parent class

// Multiple inheritance -> when class is derived from two or more parent classes => java doesn't support multiple inheritance.

class Parent{
	public void printParent() {
		System.out.println("Parent class");
	}
}

class Child1 extends Parent{
	public void printChild() {
		System.out.println("Child1 class");
	}
}

class Child2 extends Parent{
	public void printChild() {
		System.out.println("Child2 class");
	}
}

public class MyHeirarchicalInheritance {

	public static void main(String[] args) {
		
		// first child
		Child1 ch1 = new Child1();
		ch1.printChild();
		ch1.printParent();
		
		// second child
		Child2 ch2 = new Child2();
		ch2.printChild();
		ch2.printParent();
	}

}
