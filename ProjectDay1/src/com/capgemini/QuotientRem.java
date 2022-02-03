package com.capgemini;
import java.util.*;

//Java Program to find quotient and remainder

public class QuotientRem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dividend = 6;
		
		int quotient = num / dividend;
		int remainder = num % dividend;
		
		System.out.println("Quotient is : " + quotient);
		System.out.println("Remainder is : " + remainder);

	}

}
