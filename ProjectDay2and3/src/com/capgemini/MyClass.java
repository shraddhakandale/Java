package com.capgemini;

class Student{
	
	private int rollno;
	private String name;
	static String schoolName;
	
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	static class Address{
		int houseNo;
		String streetName;
		
		public void print() {
			System.out.println("Nested class");
		}
	}
	
	// static block
	static {
		System.out.println("Static Block");
	}
	
	public String toString() {
		return "Student = [rollno =" + rollno + ", name = "+name+", School name = "+schoolName+"]";
	}
	
	//static method
	public static void staticMethod() {
		System.out.println("This is static method");
	}
}

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.schoolName = "ABC school";
		
		Student s1 = new Student(101,"student1");
		Student s2 = new Student(102,"student2");
		Student s3 = new Student(103,"student3");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Student.staticMethod();
		
		Student.Address address = new Student.Address();
		address.print();
	}

}
