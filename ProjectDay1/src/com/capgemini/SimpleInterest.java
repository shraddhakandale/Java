package com.capgemini;
import java.util.*;

//Java Program to calculate simple interest

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double P = sc.nextDouble();
		double R = sc.nextDouble();
		double T = sc.nextDouble();
		double SI;
		
		SI = (P*R*T)/100;
		System.out.println("The simple interest is : "+SI);

	}

}
