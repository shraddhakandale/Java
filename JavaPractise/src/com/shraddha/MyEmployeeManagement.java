package com.shraddha;

import java.util.*;

class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private int salary;
	
	Employee(){
		
	}
	
//	@Override
	public String toString() {
		return "Employee [name=" + name + ", iD=" + id + ", salary=" + salary + "]";
	}
		
	
	public Employee(int id, String name, int salary) {
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

	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
	
	
}

public class MyEmployeeManagement {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee[] emp = {};
		
		while(true) {
			System.out.println("Enter 1 to create the list of employee");
			System.out.println("Enter 2 to display the list of employee");
			System.out.println("Enter 3 to search the employee");
			System.out.println("Enter 4 to delete the employee");
			System.out.println("Enter 5 to exit");
			System.out.println("Enter 6 to sort in ASC by name");
			System.out.println("Enter 7 to sort in DES by name");
			System.out.println("Enter 8 to sort in ASC by salary");
			System.out.println("Enter 9 to sort in DES by salary");
			System.out.println("Enter 10 to min paid employee");
			System.out.println("Enter 11 to sort max paid employee");
			System.out.println("Enter 12 to avg of employee salary");
			System.out.println("Enter 13 to sum of employee salary");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter number of employees");
				int size = sc.nextInt();
				emp = new Employee[size];
				for(int i=0; i<size; i++) {
					System.out.println("Enter the name of Employee "+i);
					String name = sc.next();
					System.out.println("Enter the ID of Employee "+i);
					int id = sc.nextInt();
					System.out.println("Enter the salary of Employee "+i);
					int salary = sc.nextInt();
					emp[i] = new Employee(id,name,salary);
				}
			}
			
			if(choice == 2) {
				for(int i=0; i<emp.length; i++) {
					System.out.println(emp[i].toString());
				}
			}
			
			if(choice == 3) {
				System.out.println("Enter the name of employee you want to search");
				String name = sc.next();
				boolean flag = true;
				for(int i=0; i<emp.length; i++) {
				if(emp[i].getName().equalsIgnoreCase(name)) {
					System.out.println("Employee found "+emp[i].toString());
					flag = false;
					break;
				}
				}
				if(flag) {
					System.out.println("Employee not found");
				}
			}
			
			if(choice == 4) {
				boolean deleteFlag = true;
				for(int i=0; i<emp.length; i++) {
					System.out.println(emp[i]);
				}
				
				System.out.println("Enter the ID you eant to delete");
				int id = sc.nextInt();
				
				for(int i=0; i<emp.length; i++) {
					if(emp[i].getId() == id) {
						
						System.out.println("Employee found "+emp[i].toString());
						emp[i] = new Employee();
						deleteFlag = false;
						break;
					}
					
					if(deleteFlag) {
						System.out.println("Record not found");
					}
				}
			}
			
			if(choice == 5) {
				break;
			}
			
			if(choice == 6) {
				Arrays.sort(emp);
				for(int i=0;i<emp.length;i++) {
					System.out.println(emp[i].toString());
				}
				
			}
			
			if(choice == 7) {
				Arrays.sort(emp);
				for(int i=emp.length-1; i>=0; i--) {
					System.out.println(emp[i].toString());
				}
				
			}
			
			
		}
	}
}
