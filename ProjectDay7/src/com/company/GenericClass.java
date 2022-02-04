package com.company;

// generic class
// here the type of member variables is not fixed 
// T,V,Z are the variables which behaves as datatypes
// data type is passed by user at the time of creating object
class Person<T,V,Z>{
	private T name;
	private V id;
	private Z age;
	
	public Person(T name, V id, Z age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void printPerson() {
		System.out.println("Name: "+this.name);
		System.out.println("ID: "+this.id);
		System.out.println("Age: "+this.age);
	}
	
}

public class GenericClass {

	public static void main(String[] args) {
		Person p = new Person("shraddha",101,22);
		p.printPerson();
		
		System.out.println("-----------------------------------------------");
		
		// generic class
		// we have to pass data types while creating objects
		Person<String, Integer, Integer> p1 = new
				Person<String, Integer, Integer>("Shraddha",101,22);
		p1.printPerson();

	}

}
