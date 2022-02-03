package com.capgemini;
import java.util.*;

//Java Program to Check Even or Odd Number

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println(num +" is even number");
		}
		else {
			System.out.println(num+" is odd number");
		}
		
	}

}
