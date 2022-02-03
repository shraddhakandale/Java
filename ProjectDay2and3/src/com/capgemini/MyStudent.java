package com.capgemini;

class Students{
	private int studId;
	private String studName;
	private String course;
	
	Students(){
		
	}
	
	public Students(int studId, String studName, String course){
		this.studId = studId;
		this.studName = studName;
		this.course = course;
	}

	//setters
	public void setStudId(int studId) {
		this.studId = studId;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	//getters
	public int getStudId() {
		return studId;
	}

	public String getStudName() {
		return studName;
	}

	public String getCourse() {
		return course;
	}

	//methods
	public void printStudentsDetails(){
		System.out.println("Roll No : "+this.studId);
		System.out.println("My name is "+this.studName);
		System.out.println("I am learning "+this.course+" course");
	}
	
}

public class MyStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s1 = new Students();
		s1.setStudId(101);
		s1.setStudName("student1");
		s1.setCourse("Java");
		
		System.out.println("Roll No : "+s1.getStudId());
		System.out.println("My name is "+s1.getStudName());
		System.out.println("I am learning "+s1.getCourse()+" course");
		
		System.out.println("==========================================================");
		
		Students s2 = new Students(102,"student2","Python");
		s2.printStudentsDetails();
		
		System.out.println("==========================================================");
		
		Students s3 = new Students(103,"student3","Reactjs");
		s3.printStudentsDetails();

	}

}
