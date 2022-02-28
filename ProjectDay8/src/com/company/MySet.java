package com.company;
import java.util.*;

// create set with the list of integer elements
// create a student class with 5 attributes
// create a set with the student
// add the option
// press 1 for insert
// press 2 for delete
// press 3 for update
// press 4 for sort asc
// press 5 for sort desc
// press 6 for print the size
// press 7 for exit

class Employee{
	private int id;
	private String name;
	private float salary;
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

//List
//List Maintain the order
//have any number of null and duplicate element
public class MySet {

	public static void main(String[] args) {
		
		//Set
		//set does not maintain the order
		//duplicate element is not allowed
		
		//HashSet--part of set
		//it does not maintain order and does not contain duplicate 
		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		System.out.println("HashSet : "+s.toString());
		
		//TreeSet
		//it is sorting the data 
		//duplicate is not allowed
		Set<Integer> st = new TreeSet();
		st.add(10);
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		System.out.println("TreeSet : "+st.toString());
		
		//LinkedHashSet
		//--duplicate not allowed 
		//Maintain the order
		Set<Integer> sortedSet = new LinkedHashSet();
		sortedSet.add(20);
		sortedSet.add(20);
		sortedSet.add(10);
		sortedSet.add(30);
		sortedSet.add(40);
		System.out.println("LinkedHashSet : "+sortedSet.toString());
		
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee(10, "Ansar", 100.0f));
		employeeList.add(new Employee(1, "Priya", 100.0f));
		employeeList.add(new Employee(2, "Kumar", 100.0f));
		employeeList.add(new Employee(100, "Anil", 100.0f));
		employeeList.add(new Employee(5, "Zee", 100.0f));
		
		employeeList.forEach(System.out::println);
		
		
		Set<Employee> employeeSet=new LinkedHashSet<Employee>();
		employeeList.add(new Employee(10, "Ansar", 100.0f));
		employeeList.add(new Employee(1, "Priya", 100.0f));
		employeeList.add(new Employee(2, "Kumar", 100.0f));
		employeeList.add(new Employee(100, "Anil", 100.0f));
		employeeList.add(new Employee(5, "Zee", 100.0f));
		employeeList.add(new Employee(100, "Anil", 100.0f));
		employeeList.add(new Employee(5, "Zee", 100.0f));
		
		employeeList.forEach(System.err::println);
		

	}

}
