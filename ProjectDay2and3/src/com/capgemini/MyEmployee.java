package com.capgemini;

class Employee{
	
	private String name;
	private int age;
	private double salary;
	private String designation;
	
	public Employee(String name, int age, double salary, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
	}
	
	public void employeeDetails() {
		System.out.println("My name is "+this.name+" i am "+this.age+" years old. and I am working as "+this.designation+".");
	}
	
	public void printSalary() {
		System.out.println("Salary of " +this.name+ " is : "+this.salary);
	}
	
}

public class MyEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("ABC",24,400000.00,"Analyst");
		e1.printSalary();
		
		System.out.println("=====================================================");

		Employee e2 = new Employee("LMN",26,600000.00,"Senior Analyst");
		e2.employeeDetails();
		
		System.out.println("=====================================================");
		
		Employee e3 = new Employee("PQR",30,700000.00,"DBA");
		e3.employeeDetails();

	}

}
