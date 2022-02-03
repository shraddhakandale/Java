package com.capgemini;
import java.util.*;

//Java Program to check Leap Year

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}

	}

}
