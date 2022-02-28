package com.company;
import java.util.*;

//create set with the list of integer elements
//create a student class with 5 attributes
//create a set with the student
//add the option
//press 1 for insert
//press 2 for delete
//press 3 for update
//press 4 for sort asc
//press 5 for sort desc
//press 6 for print the size
//press 7 for exit

class MyStudent{
	private int rollNo;
	private String name;
	private String city;
	private String course;
	private int yearOfStudy;
	
	public MyStudent(int rollNo, String name, String city, String course, int yearOfStudy) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
		this.course = course;
		this.yearOfStudy = yearOfStudy;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getCourse() {
		return course;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + rollNo + ",\n name=" + name + ",\n city=" + city + ",\n course="+course+",\n year of study="+yearOfStudy +"]";
	}
	
	
}

public class StudentSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedHashSet<MyStudent> studentSet = new LinkedHashSet<MyStudent>();
		
		while(true) {
			System.out.println("Enter 1 to insert data");
			System.out.println("Enter 2 to delete data");
			System.out.println("Enter 3 to update data");
			System.out.println("Enter 4 to sort data in ascending order");
			System.out.println("Enter 5 to sort data in descending order");
			System.out.println("Enter 6 to print the size");
			System.out.println("Enter 7 to exit");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter roll number");
				int rollNo = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter city");
				String city = sc.next();
				System.out.println("Enter course");
				String course = sc.next();
				System.out.println("Enter year of study : ");
				int yearOfStudy = sc.nextInt();
				
				studentSet.add(new MyStudent(rollNo, name, city, course, yearOfStudy));
				System.out.println(studentSet.toString());
			}
			
			if(choice == 2) {
				System.out.println("Enter the roll no of the student you want to remove");
				int rollno = sc.nextInt();
				for(MyStudent s: studentSet) {
					if(s.getRollNo() == rollno) {
						MyStudent ro = new MyStudent(s.getRollNo(),s.getName(),s.getCity(),s.getCourse(),s.getYearOfStudy());
						System.out.println(ro.toString());
						studentSet.remove(ro);
						for(MyStudent obj: studentSet) {
							System.out.println(obj);
						}
						break;
					}
				}
//				System.out.println(studentSet.toString());
			}
			
			
		}
		
	}

}
