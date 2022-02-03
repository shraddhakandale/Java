package com.capgemini;

// Encapsulation -> it is wrapping up of the data and code in a single unit called class
// in encapsulation direct access is restricted by making the attributes private which helps to
// prevent the accidental modification of the data
// in encapsulation we can access this private attributes through the methods
// that are declared in the same class these methods are getters and setters.

class Employee{
	
	private int empId;
	private String name;
	private float salary;
	
	public Employee(int empId, String name, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}

public class MyEncapsulation {

	public static void main(String[] args) {
		Employee emp = new Employee(101,"Shraddha",10000);
		System.out.println(emp.getEmpId());

	}

}
