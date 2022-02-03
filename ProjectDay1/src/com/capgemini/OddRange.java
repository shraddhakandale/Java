package com.capgemini;

//Java Program to display odd numbers from 1 to n or 1 to 100

public class OddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;

		for (i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " is ODD number");
			} 
		}
	}

}
