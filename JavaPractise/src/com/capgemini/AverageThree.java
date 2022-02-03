package com.capgemini;
import java.util.*;

//Java Program to Find average of 3 numbers

public class AverageThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		double avg = (num1+num2+num3)/3;
		System.out.println("Average is : "+avg);

	}

}
