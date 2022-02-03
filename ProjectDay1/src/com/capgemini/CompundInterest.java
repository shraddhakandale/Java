package com.capgemini;
import java.util.*;
import java.math.*;

//Java Program to calculate compound interest

public class CompundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double principle = sc.nextDouble();
		double rate = sc.nextDouble(); 
		double time = sc.nextDouble();
		
        double CI = principle *(Math.pow((1 + rate / 100), time));
          
        System.out.println("Compound Interest is "+ CI);
	}

}
