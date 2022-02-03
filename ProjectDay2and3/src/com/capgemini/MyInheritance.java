package com.capgemini;

// Inheritance -> it is used to derive the properties from one class to other class.

class A{
	public int a = 10;
	public void printA() {
		System.out.println("I am class A");
	}
}

class B extends A{
	public int b = 20;
	public void printB() {
		System.out.println("I am class B");
	}
}

public class MyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a = new A();
//		a.printA();
//		
//		B b = new B();
//		b.printB();
		
		B b = new B();
		b.printA();
		b.printB();
		System.out.println("b belongs to class A "+b.a);
		System.out.println("b belongs to class B "+b.b);

	}

}
