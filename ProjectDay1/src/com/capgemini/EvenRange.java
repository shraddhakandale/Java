package com.capgemini;
//java Program to display even numbers from 1 to n or 1 to 100

public class EvenRange {

	public static void main(String[] args) {
		int i = 1;

		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is EVEN number");
			} 
		}

	}

}
