package com.capgemini;

// Multilevel Inheritance -> here the properties are derived from other derived class

class A1{
	public void printA() {
		System.out.println("Class A");
	}	
}

class B1 extends A1{
	public void printB() {
		System.out.println("Class B");
	}
}

class C1 extends B1{
	public void printC() {
		System.out.println("Class C");
	}
}

class D1 extends C1{
	public void printD() {
		System.out.println("Class D");
	}
}

public class MyMultilevelInheritance {

	public static void main(String[] args) {
		D1 d = new D1();
		d.printA();
		d.printB();
		d.printC();
		d.printD();
	}

}
