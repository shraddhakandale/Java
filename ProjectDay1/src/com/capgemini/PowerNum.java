package com.capgemini;
import java.util.*;

//Java Program to calculate power of a number

public class PowerNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int power = sc.nextInt();
		
		int count = 1;
		int res = 1;
		while(count <= power) {
			res = res*base;
			count ++;
		}
		
		System.out.println(base + " raise to " + power + " = " + res);
	}

}
