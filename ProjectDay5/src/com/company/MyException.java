package com.company;

// Exception -> exception is error in java

// there are two types of errors -> 
// 1)syntax error -> it is identified by compiler and code is not compiled
// 2)logical error -> logical error is called exception
// each exception is having some name
// to handle the exception we use try catch block

// Serializable interface -> throwable -> exception

// Exception -> 1)Runtime 2)IoException
// checked exception -> compiler force us to handle the exception
// unchecked exception

public class MyException {

	public static void main(String[] args) {
		
		// FileInputStream inputStream = new FileInputStream("c:\\file.txt"); // its checked exception
		
		try {
			
			System.out.println("First line");
			String s = null;
			System.out.println(s.substring(5));
			System.out.println("is the exception occur this line is not executed");
			
		}catch(Exception e) {
			System.out.println("Exception occured give some value to string");
		}
	}

}
