package com.capgemini;

public class MynestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String uname = "ABC";
		String pass = "ABC@123";
		if (uname == "ABC") {
			if (pass == "ABC@123") {
				System.out.println("login successful");
			} else {
				System.out.println("Invalid passowrd");
			}
		} else {
			System.out.println("Invalid username");
		}

	}

}
